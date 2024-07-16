package com.nta.forum.controller;

import com.nta.forum.domain.resposta.DadosListagemResposta;
import com.nta.forum.domain.resposta.DadosResposta;
import com.nta.forum.domain.resposta.Resposta;
import com.nta.forum.domain.resposta.RespostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/respostas")
public class RespostaController {

    @Autowired
    private RespostaRepository respostaRepository;


    @PostMapping
    @Transactional
    public void cadastrarResposta(@RequestBody DadosResposta dados) {

        Resposta novaResposta = respostaRepository.save(new Resposta(dados));


    }

    @GetMapping
    public List<DadosListagemResposta> listar(){
        return respostaRepository.findAll().stream().map(DadosListagemResposta::new).toList();
    }


}