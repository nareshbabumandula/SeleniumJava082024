package com.casting;

public class Child extends Parent{

	void m1() {
		System.out.println("Executing m1 method of child class");
	}
	
	void m3() {
		System.out.println("Executing m3 method of child class");
	}
		
	public static void main(String[] args) {
		// WebDriver driver = new ChromeDriver();
		// Upcasting: Converting the sub type to it immediate super type
		Parent p = new Child();
		p.m1(); // Overridden method of child class
		p.m2(); // unique method of parent class
	}

}
