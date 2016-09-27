package com.designpatterns.behavioural.state;

public enum Speed {
	OFF(0),
	LOW(1),
	MEDIUM(2),
	HIGH(3);
	
	private final int speed;
	
	Speed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeedValue() {
		return speed;
	}
}
