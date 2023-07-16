package br.com.design.patterns.decorator.model;

public class FrenchFries implements Meal {
    @Override
    public void serve() {
        System.out.println("Adding French Fries");
    }

    @Override
    public Double getPrice() {
        return 5d;
    }
}
