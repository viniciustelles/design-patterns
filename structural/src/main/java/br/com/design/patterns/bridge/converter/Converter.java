package br.com.design.patterns.bridge.converter;

import br.com.design.patterns.bridge.model.Employee;

public interface Converter {

    String getEmployeeConverted(Employee employee);
}
