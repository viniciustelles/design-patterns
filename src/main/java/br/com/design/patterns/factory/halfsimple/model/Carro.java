package br.com.design.patterns.factory.halfsimple.model;

public class Carro implements Veiculo {

    @Override
    public void ligar() {
        System.out.println("Ligando carro...");
    }
}
