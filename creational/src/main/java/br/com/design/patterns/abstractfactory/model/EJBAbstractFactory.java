package br.com.design.patterns.abstractfactory.model;


import br.com.design.patterns.abstractfactory.service.CarEJBService;
import br.com.design.patterns.abstractfactory.service.CarService;
import br.com.design.patterns.abstractfactory.service.UserEJBService;
import br.com.design.patterns.abstractfactory.service.UserService;

public class EJBAbstractFactory implements AbstractServiceFactory {

	@Override
	public UserService getUserService() {
		return new UserEJBService();
	}

	@Override
	public CarService getCarService() {
		return new CarEJBService();
	}

}



