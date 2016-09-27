package com.designpatterns.behavioural.interpreter;

public class Variable implements Expression {

	private String variable;
	
	public Variable(String variable) {
		this.variable = variable;
	}

	public int interpret(Context ctx) {		
		return ctx.get(variable);
	}

}
