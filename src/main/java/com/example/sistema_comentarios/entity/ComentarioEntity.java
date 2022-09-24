package com.example.sistema_comentarios.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="comentario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComentarioEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer id;
    private String nome;
    private String comentario;
    private Integer avaliacao;

    public ComentarioEntity(@JsonProperty("nome") String nome, @JsonProperty("comentario") String comentario, @JsonProperty("avaliacao") Integer avaliacao) {
        this.nome = nome;
        this.comentario = comentario;
        this.avaliacao = avaliacao;
    }
}
