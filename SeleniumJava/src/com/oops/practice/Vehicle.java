package com.oops.practice;

public abstract class Vehicle 
{

	//static String makeC="Hyndai";
	//static String modelC="i10";
	//static String makeB="RoyalEnfield";
	//static String modelB="ThunderBird";
	int year;
	void feature(String make, String model)
	{
		System.out.println("This vehicle is made by'"+make+"' and the model is "+"'"+model+"'");
	}
	abstract void startEngine();
	abstract void stopEngine();

	public static void main(String[] args) 
	{	
	}

}
