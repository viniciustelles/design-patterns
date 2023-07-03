package br.com.design.patterns.factory.halfsimple.factory;

import br.com.design.patterns.factory.halfsimple.model.Veiculo;

public abstract class VeiculoFactory {

    abstract Veiculo create();

    public void ligar() {
        Veiculo veiculo = create();
        veiculo.ligar();
    }
}
