package com.oops.practice;

public class Bike extends Vehicle
{
	void startEngine() {
		System.out.println("Abstract method to start the engine for Bike");

	}

	@Override
	void stopEngine() {
		System.out.println("Abstract method to stop the engine for bike");

	}
	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.startEngine();
		bike.stopEngine();
		System.out.println(Vehicle.makeB);
		System.out.println((Vehicle.modelB));
	}
}