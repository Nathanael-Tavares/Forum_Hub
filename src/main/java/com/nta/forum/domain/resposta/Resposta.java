package com.nta.forum.domain.resposta;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "resposta")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Resposta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "idTopico")
    private Long idTopico;

    private String autor;

    private String mensagem;

    public Resposta(DadosResposta dados) {
        this.idTopico= dados.idTopico();
        this.autor=dados.autor();
        this.mensagem=dados.mensagem();
    }
}
