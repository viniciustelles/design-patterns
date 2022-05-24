package com.strategy;

public class RelatorioCliente implements Relatorio<FiltroCliente> {

    @Override
    public void gerar(FiltroCliente filtro) {
        System.out.println("Gerando relatório de clientes com o filtro: \n" + filtro);
    }
}
