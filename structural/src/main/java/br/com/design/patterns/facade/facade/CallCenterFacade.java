package br.com.design.patterns.facade.facade;

import br.com.design.patterns.facade.model.Card;
import br.com.design.patterns.facade.model.Register;
import br.com.design.patterns.facade.services.*;

import java.util.List;

public class CallCenterFacade {
	CardService cardService;
	RegisterService registerService;
	ReportService reportService;
	PaymentService paymentService;
	SecurityService securityService;
	
	public CallCenterFacade() {
		cardService = new CardService();
		registerService = new RegisterService();
		reportService = new ReportService(registerService);
		paymentService = new PaymentService(registerService);
		securityService = new SecurityService(cardService, registerService);
	}
	
	public Card getCardByUser(Long l) {
		return cardService.getCardByUser(l);
	}
	
	public void getSumary(Card card) {
		reportService.getSumary(card);
	}
	
	public void getPaymentInfoByCard(Card card) {
		paymentService.getPaymentInfoByCard(card);
	}
	
	public void cancelLastRegister(Card card) {
		List<Register> registers = registerService.getRegistersByCard(card);
		registerService.removeByIndex(card, registers.size() - 1);
		List<Register> pendingRegisters = securityService.blockCard(card);
		Card newCard = cardService.createNewCard(123456L, 33445566L);
		registerService.addCardRegisters(newCard, pendingRegisters);
		reportService.getSumary(newCard);
	}
}
