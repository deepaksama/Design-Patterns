package com.designpatterns.behavioural.state;

public class HighSpeedState implements State {

	@Override
	public Speed increaseSpeed() {
		return Speed.OFF;
	}

	@Override
	public Speed decreaseSpeed() {
		return Speed.MEDIUM;
	}

}
