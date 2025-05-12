package com.ardenghe.foodapi.di.model;

import org.springframework.web.bind.annotation.GetMapping;

public class Cliente {

    private String nome;
    private String email;
    private String telefone;
    private boolean ativo = false;

    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    @GetMapping
    public String getNome() {
        return nome;
    }

    @GetMapping
    public String getEmail() {
        return email;
    }

    @GetMapping
    public String getTelefone() {
        return telefone;
    }

    public void ativar() {

    }
}
