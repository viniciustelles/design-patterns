package br.com.design.patterns.bridge;

import br.com.design.patterns.bridge.converter.CSVConverter;
import br.com.design.patterns.bridge.converter.Converter;
import br.com.design.patterns.bridge.converter.JSONConverter;
import br.com.design.patterns.bridge.model.Employee;
import br.com.design.patterns.bridge.model.ProjectManager;
import br.com.design.patterns.bridge.model.SoftwareDeveloper;

public class MainApp {

    public static void main(String[] args) {
        Converter csvConverter = new CSVConverter();
        Converter jsonConverter = new JSONConverter();

        Employee developer = new SoftwareDeveloper("Software Developer", 22);
        Employee manager = new ProjectManager("Project Manager", 32);

        System.out.println(csvConverter.getEmployeeConverted(developer));
        System.out.println(jsonConverter.getEmployeeConverted(developer));

        System.out.println(csvConverter.getEmployeeConverted(manager));
        System.out.println(jsonConverter.getEmployeeConverted(manager));



    }
}
