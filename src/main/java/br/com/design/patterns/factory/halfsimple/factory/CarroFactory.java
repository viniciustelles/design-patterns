package br.com.design.patterns.factory.halfsimple.factory;

import br.com.design.patterns.factory.halfsimple.model.Carro;
import br.com.design.patterns.factory.halfsimple.model.Veiculo;

public class CarroFactory extends VeiculoFactory {
    @Override
    Veiculo create() {
        return new Carro();
    }
}
