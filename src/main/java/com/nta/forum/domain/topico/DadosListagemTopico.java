package com.nta.forum.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record DadosListagemTopico (
        Long id,
        String titulo,
                                   String mensagem,
                                   Date data,
                                   Estado estado,
                                   String autor,
                                   String curso){


    public DadosListagemTopico(Topico topico){
        this(topico.getId(),topico.getTitulo(),topico.getMensagem(),topico.getData(),topico.getEstado(), topico.getAutor(),topico.getCurso());
    }
}
