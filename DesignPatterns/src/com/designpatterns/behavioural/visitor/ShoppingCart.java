package com.designpatterns.behavioural.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart {
	
	private List<Item> itemList;
	
	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	public ShoppingCart() {		
		this.itemList = new ArrayList<Item>();
	}	
	
	public void add(Item item) {
		itemList.add(item);
	}	
}
