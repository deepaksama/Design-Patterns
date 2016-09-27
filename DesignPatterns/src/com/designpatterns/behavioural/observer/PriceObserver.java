package com.designpatterns.behavioural.observer;

import java.util.Observable;
import java.util.Observer;

public class PriceObserver implements Observer {

	private float price;
	
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void update(final Observable o, final Object arg) {
		if(arg instanceof Float) {
			this.price = (Float) arg;
			System.out.println("PriceObserver : Stock Price changed to " + this.price);
		} else {
			System.out.println("PriceObserver : Some property changed on Subject");
		}
	}
	
}
