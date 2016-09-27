package com.designpatterns.behavioural.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeIterator implements Iterator<Employee> {

	private ArrayList<Employee> list;
	private int index;
	private Designation designation;
	
	
	public EmployeeIterator(ArrayList<Employee> list, Designation designation) {
		super();
		this.list = list;
		this.designation = designation;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		
		if(findNext() == -1)		
			return false;
		else
			return true;
	}

	@Override
	public Employee next() {
		Employee e = null;		
		if( (index = findNext()) != -1)
			e = list.get(index);
		
		index++;
		return e;
	}

	public int findNext() {
		Employee e = null;
		int index = this.index;
		while(index < list.size() && e == null)
		{
			if(list.get(index).getDesignation() == this.designation )
			{
				e = list.get(index);
				break;
			}
			
			index++;			
		}
		
		if(e == null)
			return -1;
		
		return index;
	}
}
