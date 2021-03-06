package com.designpatterns.behavioural.interpreter;

public class Sub implements Expression {

	private Expression leftExpression;
	private Expression righExpression;
	
	
	public Sub(Expression leftExpression, Expression righExpression) {
		this.leftExpression = leftExpression;
		this.righExpression = righExpression;
	}

	public int interpret(Context ctx) {
		
		return leftExpression.interpret(ctx) - righExpression.interpret(ctx);
	}

}
