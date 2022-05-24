package com.strategy;

public class Contexto<T> {

    private Relatorio<T> relatorio;

    public void setContexto(Relatorio relatorio) {
        this.relatorio = relatorio;
    }

    public void gerar(T filtro) {
        relatorio.gerar(filtro);
    }
}
