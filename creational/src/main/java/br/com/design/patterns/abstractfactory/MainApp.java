package br.com.design.patterns.abstractfactory;

import br.com.design.patterns.abstractfactory.model.AbstractServiceFactory;
import br.com.design.patterns.abstractfactory.model.EJBAbstractFactory;
import br.com.design.patterns.abstractfactory.service.CarService;
import br.com.design.patterns.abstractfactory.service.UserService;

public class MainApp {

    public static void main(String[] args) {
        AbstractServiceFactory factory = new EJBAbstractFactory();
//		ServicesAbstractFactory factory = new RestAbstractFactory();

        UserService userService = factory.getUserService();
        userService.save("Jhon");
        userService.delete(5);

        CarService carService = factory.getCarService();
        carService.save("Prius");
        carService.update("Tesla X");
    }
}
