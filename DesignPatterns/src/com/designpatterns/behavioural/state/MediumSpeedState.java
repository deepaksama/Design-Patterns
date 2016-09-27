package com.designpatterns.behavioural.state;

public class MediumSpeedState implements State {

	@Override
	public Speed increaseSpeed() {
		return Speed.HIGH;
	}

	@Override
	public Speed decreaseSpeed() {
		return Speed.LOW;
	}

}
