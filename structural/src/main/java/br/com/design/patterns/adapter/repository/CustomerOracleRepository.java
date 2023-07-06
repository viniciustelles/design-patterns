package br.com.design.patterns.adapter.repository;

import br.com.design.patterns.adapter.model.Customer;

public class CustomerOracleRepository implements Repository {

    @Override
    public void save(Customer customer) {
        System.out.println("Saving customer with orcle implementation...");
    }
}
