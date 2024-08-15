package com.oops.practice;

public class MOverloading {
	int a=100;
	int b=200;
	int m=1000;
	int n=2000;
	int c;
	void sum()
	{
		System.out.println("Sum of a and b is "+(a+b));
	}
	int sum1()
	{	
		System.out.println("Sum of m and n is "+c);

		return c=m+n;
	}
	void sum(int p,int q)
	{
		System.out.println("Sum of p and q is "+(p+q));
	}
	void sum(int s, int r, int t)
	{
		System.out.println("Sum of s, r and t is "+(s+r+t));
	}
	public static void main(String[] args) {

		MOverloading mOverloading=new MOverloading();
		mOverloading.sum();
		mOverloading.sum1();
		mOverloading.sum(500,500);
		mOverloading.sum(1000,2000,3000);
	}

}
