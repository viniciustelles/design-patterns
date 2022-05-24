package com.strategy;

public class RelatorioVenda implements Relatorio<FiltroVenda> {

    @Override
    public void gerar(FiltroVenda filtro) {
        System.out.println("Gerando relatório de vendas com o filtro: \n" + filtro);
    }
}
