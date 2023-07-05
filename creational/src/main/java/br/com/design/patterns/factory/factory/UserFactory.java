package br.com.design.patterns.factory.factory;

import br.com.design.patterns.factory.model.User;

public interface UserFactory {

    User create(String name, String password);
}
