package br.com.design.patterns.observer;

import br.com.design.patterns.observer.observers.Friend;
import br.com.design.patterns.observer.observers.Wife;
import br.com.design.patterns.observer.subject.Doorman;

public class Client {

	public static void main(String[] args) {
		Doorman doorman = new Doorman();
		doorman.add(new Wife());
		doorman.add(new Friend());
		
		System.out.println("Husband is comming");
		doorman.setStatus(true);
	}
}
