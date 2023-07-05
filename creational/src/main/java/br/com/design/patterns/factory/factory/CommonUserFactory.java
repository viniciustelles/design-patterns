package br.com.design.patterns.factory.factory;

import br.com.design.patterns.factory.model.CommonUser;
import br.com.design.patterns.factory.model.User;

public class CommonUserFactory implements UserFactory {

    @Override
    public User create(String name, String password) {
        return new CommonUser(name, password);
    }
}
