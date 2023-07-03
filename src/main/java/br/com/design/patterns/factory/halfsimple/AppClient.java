package br.com.design.patterns.factory.halfsimple;

import br.com.design.patterns.factory.halfsimple.factory.CarroFactory;
import br.com.design.patterns.factory.halfsimple.factory.MotoFactory;
import br.com.design.patterns.factory.halfsimple.factory.VeiculoFactory;

public class AppClient {

    public static void main(String[] args) {
        VeiculoFactory motoFactory = new MotoFactory();
        motoFactory.ligar();

        VeiculoFactory carroFactory = new CarroFactory();
        carroFactory.ligar();
    }
}
