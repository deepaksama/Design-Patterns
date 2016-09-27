package com.designpatterns.behavioural.memento;

import java.util.ArrayList;

public class CareTaker {

	private ArrayList<Originator.Memento> savedStates = new ArrayList<Originator.Memento>();
	int currentState;
	int numberOfStates;
	
	public CareTaker() {
	}
	
	public void saveState(Originator.Memento m) {
		savedStates.add(m);
	}
	
	public Originator.Memento getState(int index) {
		return savedStates.get(index);
	}
	
	public static void main(String[] args) {
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		originator.setState("State 1");
		originator.setState("State 2");
		careTaker.saveState(originator.saveToMemo());
		originator.setState("State 3");
		originator.setState("State 4");
		careTaker.saveState(originator.saveToMemo());
		originator.setState("State 5");
		originator.setState("State 6");
		originator.restoreFromMemento(careTaker.getState(0));
		
	}

}
