package br.com.design.patterns.factory.simple.model;

public class ExportarCSV implements ExportarArquivo {
    @Override
    public void exportar() {
        System.out.println("Exportando arquivo no formato CSV...");
    }
}
