package com.nta.forum.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record DadosCadastroTopico(

        @NotBlank
        String titulo,
        @NotBlank
        String mensagem,
        Date data,
        @NotNull
        Estado estado,
        @NotNull
        String autor,
        @NotBlank
        String curso) {
}
