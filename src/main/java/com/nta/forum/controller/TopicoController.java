package com.nta.forum.controller;

import com.nta.forum.domain.topico.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository repository;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroTopico dados){
       repository.save(new Topico(dados));
    }
    @GetMapping
    public List<DadosListagemTopico> listar(){
        return repository.findAll().stream().map(DadosListagemTopico::new).toList();

    }
    @GetMapping("/{id}")
    public ResponseEntity detalhar(@PathVariable Long id) {
        var topico = repository.getReferenceById(id);
        return ResponseEntity.ok(new DadosDetalhamentoTopico(topico));
    }
    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid  DadosAtualizacaoTopico dados){
        var topico= repository.getReferenceById(dados.id());
        topico.atualizarInformações(dados);

    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        repository.deleteById(id);
    }

}
