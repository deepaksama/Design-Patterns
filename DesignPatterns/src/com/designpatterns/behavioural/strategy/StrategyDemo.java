package com.designpatterns.behavioural.strategy;

public class StrategyDemo {

	public static void main(String[] args) {
		
		IPaymentStrategy paymentStrategy = null;
		float amount = 10.50F;
		String paymentMethod = "Bank";
		
		if(paymentMethod.equals("CC")) {
			paymentStrategy = new PayWithCreditCard();
		} else {
			paymentStrategy = new PayWithBank();
		}
		
		paymentStrategy.pay(amount);
	}

}
