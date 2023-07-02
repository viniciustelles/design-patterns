package br.com.design.patterns.factory.factory;

import br.com.design.patterns.factory.model.ExportarArquivo;
import br.com.design.patterns.factory.model.ExportarCSV;
import br.com.design.patterns.factory.model.ExportarPDF;

public class ExportarArquivoFactory {

    private ExportarArquivoFactory() {

    }

    public static ExportarArquivo exportar(final String type) {
        ExportarArquivo exportarArquivo;

        if ("csv".equalsIgnoreCase(type)) {
            exportarArquivo = new ExportarCSV();
        } else if ("pdf".equalsIgnoreCase(type)) {
            exportarArquivo = new ExportarPDF();
        } else {
            throw new IllegalArgumentException("Formato de arquivo não suportado!");
        }

        exportarArquivo.exportar();

        return exportarArquivo;
    }
}
