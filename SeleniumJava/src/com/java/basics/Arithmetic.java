package com.java.basics;

public class Arithmetic {

	int a=20;
	int b=40;

	void addition() {
		int c=a+b;
		System.out.println("Addition of and b is : " + c);
	}

	void subtraction() {
		int c=a-b;
		System.out.println("Subtraction of and b is : " + c);
	}

	// No argument constructor
	public Arithmetic() {
		System.out.println("This is a no argument constructor..!");
	}

	// parameterized constructor with parameters int a,int b
	public Arithmetic(int a, int b) {
		this.a=a;
		this.b=b;
		System.out.println("This is a parameterized constructor with parameters : " + a + "," + b);
	}

	public static void main(String[] args) {
		// Here Arithmetic() is a constructor which is created by Java compiler as a default constructor
		Arithmetic arth  = new Arithmetic();
		arth.addition();
		arth.subtraction();
		Arithmetic art  = new Arithmetic(100, 200);
		art.addition();
		art.subtraction();

	}

}
