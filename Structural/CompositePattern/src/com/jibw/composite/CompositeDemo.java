package com.jibw.composite;

public class CompositeDemo {

	public static void main(String[] args) {
		Menu mainMenu = new Menu("Main");
		MenuItem menuItem1 = new MenuItem("MenuItem 1", "/menuItem1");
		MenuItem menuItem2 = new MenuItem("MenuItem 2", "/menuItem2");
		MenuItem menuItem3 = new MenuItem("MenuItem 3", "/menuItem3");
		MenuItem menuItem4 = new MenuItem("MenuItem 4", "/menuItem4");
		Menu submenu1 = new Menu("SubMenu1");
		Menu submenu2 = new Menu("SubMenu2");
		submenu1.add(menuItem1);
		submenu1.add(menuItem2);
		
		submenu2.add(menuItem3);
		submenu2.add(menuItem4);

		mainMenu.add(submenu1);
		mainMenu.add(submenu2);
		
		System.out.println(mainMenu.toString());
	}

}
