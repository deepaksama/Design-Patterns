package com.designpatterns.behavioural.visitor;

public class VisitorDemo {

	public static void main(String[] args) {
		
		ShoppingCart cart = new ShoppingCart();		
		
		cart.add(new Book("Book1","1234",100,2));
		cart.add(new Book("Book2","1235",200,2));
		cart.add(new Fruit("F1",1.5F,25.0F));
		
		Visitor pvisitor = new PrintVisitor();
		visit(cart,pvisitor);
		Visitor tvisitor = new ItemTotalVisitor();
		float total = visit(cart,tvisitor);
		Visitor dvisitor = new DiscountVisitor();
		float discount = visit(cart,dvisitor);

		System.out.println("Bill Total : " + total);
		System.out.println("Discount  : " + discount);
		System.out.println("Payable Total : " + (total - discount));
	}

	public static float visit(ShoppingCart cart, Visitor visitor) {
		
		float total = 0.0F;
		for(Item item : cart.getItemList())
			total = total + item.accept(visitor);
		return total;
	}
}
