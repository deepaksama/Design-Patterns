package com.designpatterns.behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoomImpl implements ChatRoom {

	private List<Participant> members;
	
	public ChatRoomImpl() {
		members = new ArrayList<Participant>();
	}

	@Override
	public void register(Participant member) {
		members.add(member);
	}

	@Override
	public void sendMessage(String message,Participant member) {
		for(Participant m : members)
		{
			if(!member.equals(m))
				m.receiveMessage(message);
		}
	}

}
