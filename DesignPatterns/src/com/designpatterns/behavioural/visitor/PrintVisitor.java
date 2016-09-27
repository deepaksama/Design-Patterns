package com.designpatterns.behavioural.visitor;

public class PrintVisitor implements Visitor {

	public PrintVisitor() {
		System.out.println("========================================================");
		
	}
	@Override
	public float visit(Book book) {
		System.out.println("Item : " + book.getName() + " ISBN#" + book.getISBNNumber() + " Qty : " + book.getQuantity() + " Price/item :" + book.getPrice());
		return 0;
	}

	@Override
	public float visit(Fruit fruiit) {
		System.out.println("Item : " + fruiit.getName() + " Weight : " + fruiit.getWeight() + " Price/kg :" + fruiit.getPricePerKg());
		return 0;
	}

}
