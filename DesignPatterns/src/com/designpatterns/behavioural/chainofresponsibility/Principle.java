package com.designpatterns.behavioural.chainofresponsibility;

public class Principle extends Staff {

	public void  handleRequest(Request request)
	{
		if(request.getRequestLevel() == RequestLevel.MEDIUM)
		{
			System.out.println("Principle : Handling Request");
			return;
		}
		
		System.out.println("Principle : Forwarding request to Director"); 
		getBoss().handleRequest(request);
	}
}
