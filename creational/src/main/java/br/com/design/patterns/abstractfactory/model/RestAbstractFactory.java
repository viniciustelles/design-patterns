package br.com.design.patterns.abstractfactory.model;


import br.com.design.patterns.abstractfactory.service.CarRestApiService;
import br.com.design.patterns.abstractfactory.service.CarService;
import br.com.design.patterns.abstractfactory.service.UserRestApiService;
import br.com.design.patterns.abstractfactory.service.UserService;

public class RestAbstractFactory implements AbstractServiceFactory {

	@Override
	public UserService getUserService() {
		return new UserRestApiService();
	}

	@Override
	public CarService getCarService() {
		return new CarRestApiService();
	}

}
