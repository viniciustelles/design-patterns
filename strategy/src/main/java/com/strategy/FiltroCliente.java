package com.strategy;

public class FiltroCliente {

    private final String nome;

    public FiltroCliente(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
