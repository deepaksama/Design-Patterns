package com.designpatterns.behavioural.visitor;

import java.util.HashMap;
import java.util.Map;

public class DiscountVisitor implements Visitor {

	Map<Category,Integer> discounts;
	
	public DiscountVisitor() {
		discounts = new HashMap<Category,Integer>();
		discounts.put(Category.BOOKS,30);
		discounts.put(Category.FRUITS,20);
	}
	
	@Override
	public float visit(Book book) {
		return discounts.get(book.getCategory()) * book.getPrice() * book.getQuantity() / 100;
	}

	@Override
	public float visit(Fruit fruit) {		
		return discounts.get(fruit.getCategory()) * fruit.getPricePerKg() * fruit.getWeight() /100;
	}

}
