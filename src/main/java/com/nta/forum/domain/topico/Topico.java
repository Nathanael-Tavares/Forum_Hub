package com.nta.forum.domain.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

@Table(name="topicos")
@Entity(name="Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@EntityListeners(AuditingEntityListener.class)
public class Topico {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensagem;
    @CreatedDate()
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    @Enumerated(EnumType.STRING)
    private Estado estado;
    private String autor;
    private String curso;

    public Topico(DadosCadastroTopico dados) {
        this.titulo=dados.titulo();
        this.mensagem=dados.mensagem();
        this.data=dados.data();
        this.estado=dados.estado();
        this.autor=dados.autor();
        this.curso=dados.curso();
    }

    public void atualizarInformações(DadosAtualizacaoTopico dados) {
        if (dados.titulo() != null){
            this.titulo=dados.titulo();
        }
        if (dados.mensagem() != null){
            this.mensagem=dados.mensagem();
        }
        if (dados.estado() != null){
            this.estado=dados.estado();
        }
    }
}
