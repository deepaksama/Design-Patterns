package com.designpatterns.behavioural.templatemethod;

public abstract class Genralization {
	public void solution() {
		
		stepOne();
		stepTwo();
		stepThree();
		stepFour();
	}

	public void stepOne() {
		System.out.println("Genralization: Executing StepOne");
	}
	
	public void stepTwo() {
		System.out.println("Genralization: Executing StepTwo");
	}
	
	public abstract void stepThree();
	public abstract void stepFour();
}

