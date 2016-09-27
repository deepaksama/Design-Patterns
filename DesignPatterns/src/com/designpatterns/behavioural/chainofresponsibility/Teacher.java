package com.designpatterns.behavioural.chainofresponsibility;

public class Teacher extends Staff{
	
	public void  handleRequest(Request request)
	{
		if(request.getRequestLevel() == RequestLevel.LOW)
		{
			System.out.println("Teacher : Handling Request");
			return;
		}
		
		System.out.println("Teacher : Forwarding request to Principle"); 
		getBoss().handleRequest(request);
	}
}
