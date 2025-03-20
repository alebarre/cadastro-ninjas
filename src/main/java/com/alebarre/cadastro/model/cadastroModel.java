package com.alebarre.cadastro.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
public class cadastroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private Integer idade;

    public cadastroModel() {
    }

    public cadastroModel(String nome, String email, Integer idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

}
