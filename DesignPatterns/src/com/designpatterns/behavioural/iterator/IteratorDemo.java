package com.designpatterns.behavioural.iterator;

import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		IOrganization org = new Organization();
		Iterator<Employee> itr1 = org.filterIterator(Designation.ENGINEER);
		System.out.println("All Engineers : " );
		printEmployees(itr1);
		
		Iterator<Employee> itr2 = org.filterIterator(Designation.DIRECTOR);
		System.out.println("All Directors : " );
		printEmployees(itr2);

	}

	static void printEmployees(Iterator<Employee> itr) {
		System.out.print("[");
		while(itr.hasNext()) {
			Employee e = itr.next();
			System.out.print(e.getName() + ",");
		}
		System.out.println("]");
	}
}
