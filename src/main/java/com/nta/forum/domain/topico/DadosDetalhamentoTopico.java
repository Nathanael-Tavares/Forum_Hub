package com.nta.forum.domain.topico;

import java.util.Date;

public record DadosDetalhamentoTopico(String titulo,
                                      String mensagem,
                                      Date data,
                                      Estado estado,
                                      String autor,
                                      String curso) {


    public DadosDetalhamentoTopico(Topico topico){
        this(topico.getTitulo(),topico.getMensagem(),topico.getData(),topico.getEstado(), topico.getAutor(),topico.getCurso());
    }
}
