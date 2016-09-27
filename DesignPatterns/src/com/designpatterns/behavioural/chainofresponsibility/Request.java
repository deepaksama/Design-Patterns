package com.designpatterns.behavioural.chainofresponsibility;

public class Request {


	private RequestLevel requestLevel;

	public Request(RequestLevel requestLevel) {
		this.requestLevel = requestLevel;
	}

	
	public RequestLevel getRequestLevel() {
		return requestLevel;
	}

	public void setRequestLevel(RequestLevel requestLevel) {
		this.requestLevel = requestLevel;
	}
}
