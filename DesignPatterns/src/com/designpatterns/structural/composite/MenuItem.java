package com.designpatterns.structural.composite;

import java.util.Iterator;
//Leaf
public class MenuItem extends MenuComponent{

	private String url;	
	
	public MenuItem(String name, String url) {
		super(name);
		this.url = url;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String toString() {		
		return print(this);
	}
}
