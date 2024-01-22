package com.example.feriados;

public class Feriado {
    private String data;
    private String nome;

    public Feriado(String data, String nome) {
        this.data = data;
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public String getNome() {
        return nome;
    }
}

