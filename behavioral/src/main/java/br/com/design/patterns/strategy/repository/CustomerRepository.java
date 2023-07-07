package br.com.design.patterns.strategy.repository;

import br.com.design.patterns.strategy.model.Customer;

public class CustomerRepository {

    private final Repository repository;

    public CustomerRepository(Repository repository) {
        this.repository = repository;
    }

    public void save(Customer customer) {
        repository.save(customer);
    }
}
