package br.com.design.patterns.factory.model;

public class CommonUser implements User {

    private String name;
    private String password;

    public CommonUser(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public boolean isValidPassword() {
        return password != null && password.length() == 6;
    }
}
