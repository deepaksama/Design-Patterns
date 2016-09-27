package com.designpatterns.behavioural.interpreter;

import java.util.HashMap;

public class Context {
	
	private HashMap<String,Integer> variables;
	
	public Context() {
		variables = new HashMap<String,Integer>();
	}
	public Integer get(String name)
	{
		return variables.get(name);
	}
	public void put(String name,Integer value)
	{
		variables.put(name, value);
	}
}
