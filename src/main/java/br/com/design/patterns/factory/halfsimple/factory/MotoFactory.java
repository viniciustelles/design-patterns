package br.com.design.patterns.factory.halfsimple.factory;

import br.com.design.patterns.factory.halfsimple.model.Moto;
import br.com.design.patterns.factory.halfsimple.model.Veiculo;

public class MotoFactory extends VeiculoFactory {
    @Override
    Veiculo create() {
        return new Moto();
    }
}
