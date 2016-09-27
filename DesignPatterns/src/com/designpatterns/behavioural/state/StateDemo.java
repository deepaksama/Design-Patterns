package com.designpatterns.behavioural.state;

public class StateDemo {
	public static void main(String[] args) {
		Regulator regulator = new Regulator();
		regulator.increaseSpeed(); //LOW
		regulator.increaseSpeed(); //MEDIUM
		regulator.decreaseSpeed(); //LOW
		regulator.increaseSpeed(); //MEDIUM
		regulator.increaseSpeed(); //HIGH
		regulator.decreaseSpeed(); //MEDIUM
		regulator.increaseSpeed(); //HIGH
		regulator.increaseSpeed(); //OFF		
	}
}
