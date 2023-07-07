package br.com.design.patterns.bridge.converter;

import br.com.design.patterns.bridge.model.Employee;

public class CSVConverter implements Converter {

    @Override
    public String getEmployeeConverted(Employee employee) {
        return String.format("%s,%d", employee.getName(), employee.getAge());
    }
}
