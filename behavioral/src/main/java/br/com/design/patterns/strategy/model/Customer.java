package br.com.design.patterns.strategy.model;

public class Customer {

    private String name;
    private String document;

    public Customer(String name, String document) {
        this.name = name;
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public String getDocument() {
        return document;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", document='" + document + '\'' +
                '}';
    }
}
