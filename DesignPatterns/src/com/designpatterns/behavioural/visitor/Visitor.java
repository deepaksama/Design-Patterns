package com.designpatterns.behavioural.visitor;

public interface Visitor {
	public float visit(Book book);
	public float visit(Fruit fruit);
}
