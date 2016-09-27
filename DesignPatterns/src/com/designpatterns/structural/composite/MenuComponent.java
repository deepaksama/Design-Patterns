package com.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

//Component
public abstract class MenuComponent {
	
	private String name;		
	
	public MenuComponent(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return "";
	}
	
	public abstract String toString();
	
	public String print(MenuComponent menuComponent) {
		StringBuilder builder = new StringBuilder(name);
		if(!menuComponent.getUrl().isEmpty()) {
			builder.append(":");
			builder.append(menuComponent.getUrl());
		}
		builder.append("\n");
		return builder.toString();
	}
}
