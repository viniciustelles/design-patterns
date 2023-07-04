package br.com.design.patterns.factory.simple;

import br.com.design.patterns.factory.simple.factory.ExportarArquivoFactory;

public class App {

    public static void main(String[] args) {
        ExportarArquivoFactory.exportarArquivo("pdf");
        ExportarArquivoFactory.exportarArquivo("csv");
    }
}
