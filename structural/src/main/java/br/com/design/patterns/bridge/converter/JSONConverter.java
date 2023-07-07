package br.com.design.patterns.bridge.converter;

import br.com.design.patterns.bridge.model.Employee;

public class JSONConverter implements Converter {

    @Override
    public String getEmployeeConverted(Employee employee) {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n\"name\":\"");sb.append(employee.getName()).append("\",\n");
        sb.append("\"age\":");sb.append(employee.getAge()).append("\n}");
        return sb.toString();
    }
}
