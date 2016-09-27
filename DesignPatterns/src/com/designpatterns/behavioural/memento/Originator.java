package com.designpatterns.behavioural.memento;

public class Originator {
	
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("Originator: Setting state to " + state);
	}
	
	public Memento saveToMemo() {
		System.out.println("Originator: Saving to Memento.");
		return new Memento(state);
	}
	
	public void restoreFromMemento(Memento m) {
		state = m.getState();
		System.out.println("Originator: State after restoring from Memento: " + state);
	}
	
	public class Memento {		
		private final String state;
		
		private Memento(String state) {
			this.state = state;
		}
		
		public String getState() {
			return state;
		}		
	}

}
