package br.com.design.patterns.factory;

import br.com.design.patterns.factory.factory.ExportarArquivoFactory;

public class AppCliente {

    public static void main(String[] args) {

        ExportarArquivoFactory.exportar("csv");
        ExportarArquivoFactory.exportar("pdf");
    }
}
