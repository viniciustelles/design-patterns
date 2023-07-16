package br.com.design.patterns.decorator.model;

public class CheeseBurger implements Meal {

    @Override
    public void serve() {
        System.out.println("Adding cheese burger");
    }

    @Override
    public Double getPrice() {
        return 20d;
    }
}
