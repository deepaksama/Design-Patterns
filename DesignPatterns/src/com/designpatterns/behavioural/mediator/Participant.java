package com.designpatterns.behavioural.mediator;

public interface Participant {
	public void login();
	public void sendMessage(String message);
	public void receiveMessage(String message);
}
