package com.java.oops;

public class B extends A{
	
	void subtraction() {
		int c=b-a;
		System.out.println("Subtraction of a and b is : "+c);
	}

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.a);
		System.out.println(b.b);
		b.addition();
		b.subtraction();
	}
}
