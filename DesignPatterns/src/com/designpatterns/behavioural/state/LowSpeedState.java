package com.designpatterns.behavioural.state;

public class LowSpeedState implements State {

	@Override
	public Speed increaseSpeed() {
		return Speed.MEDIUM;
	}

	@Override
	public Speed decreaseSpeed() {
		return Speed.OFF;
	}

}
