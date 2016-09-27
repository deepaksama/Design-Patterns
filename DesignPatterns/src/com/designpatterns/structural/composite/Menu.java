package com.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//Composite
public class Menu extends MenuComponent {

	List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	
	public Menu(String name){
		super(name);
	}
	
	public MenuComponent add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
		return menuComponent;
	}
	
	public MenuComponent remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
		return menuComponent;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(print(this));
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while(iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			builder.append(menuComponent.toString());
		}
		
		return builder.toString();
	}

}
