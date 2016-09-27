package com.designpatterns.behavioural.visitor;

public class ItemTotalVisitor implements Visitor {

	@Override
	public float visit(Book book) {
		float total = book.getPrice() * book.getQuantity();
		return total;
	}

	@Override
	public float visit(Fruit fruit) {
		float total = fruit.getPricePerKg() * fruit.getWeight();
		return total;
	}

}
