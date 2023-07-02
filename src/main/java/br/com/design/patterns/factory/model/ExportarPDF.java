package br.com.design.patterns.factory.model;

public class ExportarPDF implements ExportarArquivo {
    @Override
    public void exportar() {
        System.out.println("Exportando arquivo no formato PDF...");
    }
}
