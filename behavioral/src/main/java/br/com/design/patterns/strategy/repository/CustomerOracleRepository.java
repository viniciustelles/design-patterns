package br.com.design.patterns.strategy.repository;

import br.com.design.patterns.strategy.model.Customer;

public class CustomerOracleRepository implements Repository {

    @Override
    public void save(Customer customer) {
        System.out.println("Saving customer with orcle implementation...");
    }
}
