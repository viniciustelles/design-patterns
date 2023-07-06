package br.com.design.patterns.adapter;

import br.com.design.patterns.adapter.model.Customer;
import br.com.design.patterns.adapter.repository.CustomerOracleRepository;
import br.com.design.patterns.adapter.repository.CustomerPostgreRepository;
import br.com.design.patterns.adapter.repository.CustomerRepository;
import br.com.design.patterns.adapter.repository.Repository;

public class MainApp {

    public static void main(String[] args) {

        // Oracle
        Repository repository = new CustomerOracleRepository();
        CustomerRepository customerRepository = new CustomerRepository(repository);
        customerRepository.save(new Customer("Customer Name", "81846952166"));


        // Postgres
        repository = new CustomerPostgreRepository();
        customerRepository = new CustomerRepository(repository);
        customerRepository.save(new Customer("Customer Name", "81846952166"));

    }
}
