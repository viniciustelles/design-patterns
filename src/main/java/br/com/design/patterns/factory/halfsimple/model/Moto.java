package br.com.design.patterns.factory.halfsimple.model;

public class Moto implements Veiculo {
    @Override
    public void ligar() {
        System.out.println("Ligando a moto...");
    }
}
