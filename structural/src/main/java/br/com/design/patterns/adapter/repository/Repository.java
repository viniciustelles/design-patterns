package br.com.design.patterns.adapter.repository;

import br.com.design.patterns.adapter.model.Customer;

public interface Repository {

    void save(Customer customer);
}
