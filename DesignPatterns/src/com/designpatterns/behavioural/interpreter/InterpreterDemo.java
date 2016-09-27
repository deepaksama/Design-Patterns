package com.designpatterns.behavioural.interpreter;

public class InterpreterDemo {
	 
	public static void main(String args[]) {
		String expression = "x y z - +";
		Context ctx = new Context();
		ctx.put("x", 10);
		ctx.put("y", 15);
		ctx.put("z", 20);
		
		//Parse the expression to syntax tree
		Evaluator sentense = new Evaluator(expression);
		int result = sentense.evaluate(ctx);
		System.out.println("Value of expression (" + expression + ") = " + result);
	}
}
