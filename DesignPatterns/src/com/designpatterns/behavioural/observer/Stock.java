package com.designpatterns.behavioural.observer;

import java.util.Observable;

public class Stock extends Observable{
	private String name;
	private float price;
	private Long volume;
	
	public Stock(String name, float price, Long volume) {
		super();
		this.name = name;
		this.price = price;
		this.volume = volume;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
		setChanged();
		notifyObservers(new Float(price));
	}

	public Long getVolume() {
		return volume;
	}

	public void setVolume(Long volume) {
		this.volume = volume;
		setChanged();
		notifyObservers(new Long(volume));
	}	
	
}
