package com.designpatterns.behavioural.iterator;

public class Employee {
	
	private String name;
	private Designation designation;
	
	public Employee(String name, Designation designation) {
		this.name = name;
		this.designation = designation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Designation getDesignation() {
		return designation;
	}
	public void setDesignation(Designation designation) {
		this.designation = designation;
	}	
}
