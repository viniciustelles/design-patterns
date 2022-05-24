package com.strategy;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        Contexto relatorio = new Contexto();

        relatorio.setContexto(new RelatorioCliente());
        relatorio.gerar(new FiltroCliente("João"));

        relatorio.setContexto(new RelatorioVenda());
        relatorio.gerar(new FiltroVenda(LocalDate.now().minusDays(1), LocalDate.now()));
    }
}
