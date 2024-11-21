package com.oops.practice;

public class MOverriding extends MOverloading{
	int a=400;
	int b=600;
	int c=300;
	void sum()
	{
		System.out.println("sum of a and b is "+(a+b));
	}
	void test()
	{
		super.sum();
		this.sum();
	}
	void sum(int a,int b,int c)
	{
		System.out.println("sum of a, b and c is "+(a+b+c));
	}
	public static void main(String[] args) {
		MOverriding mOverriding=new MOverriding();
		mOverriding.sum();
		mOverriding.test();
		mOverriding.sum(10,20,30);
	}

}
