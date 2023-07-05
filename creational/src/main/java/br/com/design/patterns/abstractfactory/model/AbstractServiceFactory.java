package br.com.design.patterns.abstractfactory.model;

import br.com.design.patterns.abstractfactory.service.CarService;
import br.com.design.patterns.abstractfactory.service.UserService;

public interface AbstractServiceFactory {

    CarService getCarService();

    UserService getUserService();
}
