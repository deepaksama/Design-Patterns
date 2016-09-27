package com.designpatterns.behavioural.strategy;

public class PayWithCreditCard implements IPaymentStrategy {

	@Override
	public void pay(float amount) {
		System.out.println("Paying Rs " + amount + " by Credit Card");

	}

}
