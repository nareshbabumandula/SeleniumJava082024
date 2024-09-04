package com.control.statements;

public class IfElseTest {
	
	void m1() {
		int x=30;
		int y=40;
		
		int z=x+y;
		System.out.println("Addition of x and y is : " +z);
	}
	
	void ifElseExample() {
		int a=5;
		int b=10;
		m1(); // Method call
		
		if (a>b) {
			System.out.println("a is greater than b");
		} else if(a==b) {
			System.out.println("a is equal to b");
		} else {
			System.out.println("a is less than b");
		}
	}
	
	void enhancedIfExample() {
		int a=2;
		int b=10;
		
		if (a>b) System.out.println("a is greater than b"); 
		else System.out.println("a is less than b");
	}
	
	public static void main(String[] args) {
	    IfElseTest iet = new IfElseTest();
	    iet.ifElseExample();
	    iet.enhancedIfExample();
	}

}
