package com.designpatterns.behavioural.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Organization implements IOrganization{

	private ArrayList<Employee> employees;
	
	public Organization() {
		employees = new ArrayList<Employee>();
		employees.add(new Employee("Anand",Designation.ENGINEER));
		employees.add(new Employee("Brain",Designation.MANAGER));
		employees.add(new Employee("Cathy",Designation.DIRECTOR));
		employees.add(new Employee("Devanand",Designation.ENGINEER));
		employees.add(new Employee("Ethan",Designation.DIRECTOR));
		employees.add(new Employee("Flora",Designation.MANAGER));
		employees.add(new Employee("Ganesh",Designation.ENGINEER));
		employees.add(new Employee("Harry Potter",Designation.MANAGER));
		employees.add(new Employee("Irfan",Designation.DIRECTOR));		
	}

	@Override
	public Iterator filterIterator(Designation designation) {
		return new EmployeeIterator(employees,designation);
	}	 
}
