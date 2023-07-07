package br.com.design.patterns.strategy;

import br.com.design.patterns.strategy.model.Customer;
import br.com.design.patterns.strategy.repository.CustomerOracleRepository;
import br.com.design.patterns.strategy.repository.CustomerPostgreRepository;
import br.com.design.patterns.strategy.repository.CustomerRepository;
import br.com.design.patterns.strategy.repository.Repository;

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
