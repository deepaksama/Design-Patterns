package com.designpatterns.behavioural.visitor;

public class Fruit implements Item {

	private String name;
	private float weight;
	private float pricePerKg;
	Category category;
	
	public Fruit(String name, float weight, float pricePerKg) {
		this.name = name;
		this.weight = weight;
		this.pricePerKg = pricePerKg;
		this.category = Category.FRUITS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getPricePerKg() {
		return pricePerKg;
	}

	public void setPricePerKg(float pricePerKg) {
		this.pricePerKg = pricePerKg;
	}
	public Category getCategory() {
		return category;
	}
	public float accept(Visitor visitor) {
		return visitor.visit(this);
	}

}
