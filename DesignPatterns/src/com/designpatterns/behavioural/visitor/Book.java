package com.designpatterns.behavioural.visitor;

public class Book implements Item {

	String name;
	Category category;
	private String ISBNNumber ;
	float price;
	private int quantity;
	
	
	public Book(String name, String iSBNNumber, float price, int quantity) {
		this.name = name;
		ISBNNumber = iSBNNumber;
		this.price = price;
		this.quantity = quantity;
		this.category = Category.BOOKS;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getISBNNumber() {
		return ISBNNumber;
	}
	public void setISBNNumber(String iSBNNumber) {
		ISBNNumber = iSBNNumber;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}

	public float accept(Visitor visitor) {		
		return visitor.visit(this);
	}
	
	
	
}
