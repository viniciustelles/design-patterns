package br.com.design.patterns.factory.simple;

import br.com.design.patterns.factory.simple.factory.ExportarArquivoFactory;

public class AppClient {

    public static void main(String[] args) {

        ExportarArquivoFactory.exportar("csv");
        ExportarArquivoFactory.exportar("pdf");
    }
}
