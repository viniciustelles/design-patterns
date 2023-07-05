package br.com.design.patterns.factory;

import br.com.design.patterns.factory.factory.CommonUserFactory;
import br.com.design.patterns.factory.model.User;

public class MainApp {

    public static void main(String[] args) {
        User user = new CommonUserFactory().create("CommonUser", "1234");
        System.out.println("Name: " + user.getName() + " is valid pass? " + user.isValidPassword());
    }
}
