package com.java.practice;

public class Car extends Vehicle {
	
	public static void main (String[]args) {
	Car car=new Car();
	car.startEngine();
	car.stopEngine();
	
	}
	
	 void startEngine() {
	        System.out.println("Car engine started.");
	    }

	    void stopEngine() {
	        System.out.println("Car engine stopped.");
	    }

}
