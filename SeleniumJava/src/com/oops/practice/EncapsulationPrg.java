package com.oops.practice;
class Sum
{
	private	int a=1000; 
	private int b=5000;

	public int getA() 
	{
		return a;
	}

	public void setA(int a) 
	{
		this.a = a;
	}

	public int getB() 
	{
		return b;
	}

	public void setB(int b) 
	{
		this.b = b;
	}
	
	public void m1()
	{
		int c=getA()+getB();
		System.out.println("Sum of updated a and b values is "+c);
	}

}

public class EncapsulationPrg extends Sum
{
	public static void main(String[] args)
	{
		EncapsulationPrg ep=new EncapsulationPrg();
		System.out.println(ep.getA());
		System.out.println(ep.getB());
		ep.setA(80000);
		System.out.println(ep.getA());
		ep.setB(90000);
		System.out.println(ep.getB());
		ep.m1();
		int c;
		c=ep.getA()+ep.getB();
		System.out.println("Addition c "+c);
	}

}