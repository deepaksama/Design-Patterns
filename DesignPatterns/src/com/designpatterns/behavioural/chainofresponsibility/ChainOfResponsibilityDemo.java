package com.designpatterns.behavioural.chainofresponsibility;

public class ChainOfResponsibilityDemo {

	public static void main(String[] args) {
		
		Teacher teacher = new Teacher();
		Principle principle = new Principle();
		Director director = new Director();
		
		teacher.setBoss(principle);
		principle.setBoss(director);
		
		Request highRequest = new Request(RequestLevel.HIGH);
		Request mediumRequest = new Request(RequestLevel.MEDIUM);
		Request lowRequest = new Request(RequestLevel.LOW);
		
		teacher.handleRequest(highRequest);
		teacher.handleRequest(mediumRequest);
		teacher.handleRequest(lowRequest);

	}

}
