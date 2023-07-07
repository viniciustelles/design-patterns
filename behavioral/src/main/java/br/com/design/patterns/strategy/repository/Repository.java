package br.com.design.patterns.strategy.repository;

import br.com.design.patterns.strategy.model.Customer;

public interface Repository {

    void save(Customer customer);
}
