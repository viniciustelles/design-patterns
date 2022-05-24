package com.strategy;

import java.time.LocalDate;

public class FiltroVenda {

    private final LocalDate dataInicio;
    private final LocalDate dataFim;

    public FiltroVenda(LocalDate dataInicio, LocalDate dataFim) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                '}';
    }
}
