package com.designpatterns.behavioural.state;
/*
 * This is Context class and responsible for State creation and destruction.
 */
public class Regulator {
	private State [] states = {new OffState(), new LowSpeedState(),new MediumSpeedState(), new HighSpeedState()};
	Speed currentSpeed; 
	
	public Regulator() {
		currentSpeed = Speed.OFF;
	}
	
	public void increaseSpeed() {
		currentSpeed = states[currentSpeed.getSpeedValue()].increaseSpeed();
		System.out.println("Current Speed :" + currentSpeed);
		
	}
	
	public void decreaseSpeed() {
		currentSpeed = states[currentSpeed.getSpeedValue()].decreaseSpeed();
		System.out.println("Current Speed :" + currentSpeed);
	}
}
