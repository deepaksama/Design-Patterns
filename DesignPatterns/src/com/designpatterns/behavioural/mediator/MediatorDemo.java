package com.designpatterns.behavioural.mediator;

public class MediatorDemo {

	public static void main(String[] args) {
		ChatRoom chatRoom = new ChatRoomImpl();
		Participant p1 = new ParticipantImpl("Raj", chatRoom);
		Participant p2 = new ParticipantImpl("Ram", chatRoom);
		Participant p3 = new ParticipantImpl("Rakesh", chatRoom);
		
		p1.login();
		p2.login();
		p3.login();
		
		p1.sendMessage("Hello all");
		p2.sendMessage("Hey Who all there..");
		p3.sendMessage("Very good morning");
	}

}
