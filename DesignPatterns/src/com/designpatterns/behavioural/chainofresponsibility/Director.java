package com.designpatterns.behavioural.chainofresponsibility;

public class Director extends Staff{

	public void  handleRequest(Request request)
	{
		if(request.getRequestLevel() == RequestLevel.HIGH)
		{
			System.out.println("Director : Handling Request");
			return;
		}
		
		System.out.println("Request cannot be handled"); 
	}
}
