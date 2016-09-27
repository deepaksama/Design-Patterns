package com.designpatterns.behavioural.strategy;

public class PayWithBank implements IPaymentStrategy {

	@Override
	public void pay(float amount) {
		System.out.println("Paying Rs " + amount + " by Bank");

	}

}
