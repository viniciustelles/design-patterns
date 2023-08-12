package br.com.design.patterns.template.service.template;

import br.com.design.patterns.template.model.Cart;

public class BlackFriday extends BestOfferTemplate {

	public BlackFriday(Cart cart) {
		super(cart);
	}

	@Override
	public boolean isAppliable() {
		return true;  //FIXME we should use calendar to be dinamic
	}

	@Override
	protected void calibrateVariables() {
		priceFactor = 0.75d;
	}
}
