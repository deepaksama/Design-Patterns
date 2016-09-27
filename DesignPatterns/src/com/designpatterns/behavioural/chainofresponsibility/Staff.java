package com.designpatterns.behavioural.chainofresponsibility;

public abstract class Staff {

	private Staff boss;

	public Staff getBoss() {
		return boss;
	}

	public void setBoss(Staff boss) {
		this.boss = boss;
	}
	
	public void  handleRequest(Request request)
	{
		getBoss().handleRequest(request);
	}
}


