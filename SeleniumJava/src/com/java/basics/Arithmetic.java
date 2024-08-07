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
	
	int m1() {
		System.out.println("Executing m1 method..!");
		return 10;
	}
	
	void m2(int x) {
		System.out.println("Return type value of m1 method passed to m2 method is : " + x);
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
		System.out.println(arth.hashCode());
		arth.addition();
		arth.subtraction();
		Arithmetic art  = new Arithmetic(100, 200);
		System.out.println(art.hashCode());
		art.addition();
		art.subtraction();
		int output = art.m1();
		art.m2(output);
	}

}
