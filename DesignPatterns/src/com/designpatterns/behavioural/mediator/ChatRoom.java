package com.designpatterns.behavioural.mediator;

public interface ChatRoom {
	public void register(Participant member);
	public void sendMessage(String message,Participant member);
}
