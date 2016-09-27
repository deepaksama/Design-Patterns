package com.designpatterns.behavioural.interpreter;

import java.util.Stack;

public class Evaluator {
	private Expression syntaxTree;
	
	
	public Evaluator(String expression) {
		Stack<Expression> stack = new Stack<Expression>();
		for(String token : expression.split(" "))
		{
			if(token.equals("+")) {
				Expression subExpression1 = stack.pop();
				Expression subExpression2 = stack.pop();
				stack.push(new Add(subExpression1,subExpression2));
			}
			else if(token.equals("-")) {
				Expression subExpression1 = stack.pop();
				Expression subExpression2 = stack.pop();
				stack.push(new Sub(subExpression1,subExpression2));
			}
			else if(token.equals("*")) {
				Expression subExpression1 = stack.pop();
				Expression subExpression2 = stack.pop();
				stack.push(new Mul(subExpression1,subExpression2));
			}
			else if(token.equals("/")) {
				Expression subExpression1 = stack.pop();
				Expression subExpression2 = stack.pop();
				stack.push(new Div(subExpression1,subExpression2));
			}
			else {
				stack.push(new Variable(token));
			}
		}
		
		this.syntaxTree = stack.pop();
	}
	
	public int evaluate(Context ctx) {
		return syntaxTree.interpret(ctx);
	}
	
}
