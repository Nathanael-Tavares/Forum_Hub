package com.nta.forum.domain.resposta;

public record DadosListagemResposta(Long id,Long idTopico, String autor ,String mensagem) {
    public DadosListagemResposta(Resposta resposta) {
        this(resposta.getId(), resposta.getIdTopico(), resposta.getAutor(), resposta.getMensagem());
    }
}
