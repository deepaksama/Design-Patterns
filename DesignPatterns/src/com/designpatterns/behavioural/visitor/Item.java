package com.designpatterns.behavioural.visitor;

public interface Item {
	public float accept(Visitor visitor);
}
