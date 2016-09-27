package com.designpatterns.behavioural.state;

public class OffState implements State {
	
	@Override
	public Speed increaseSpeed() {
		return Speed.LOW;
	}

	@Override
	public Speed decreaseSpeed() {
		return Speed.HIGH;
	}

}
