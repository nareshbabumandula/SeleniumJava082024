package com.oops.practice;

public class Car extends Vehicle
{	void startEngine() {

	System.out.println("Abstract method to start the engine for Car");	
}


void stopEngine() {
	System.out.println("Abstract method to stop the engine for Car");// TODO Auto-generated method stub

}


public static void main(String[] args) {
	Car car=new Car();
	car.startEngine();
	car.stopEngine();
	System.out.println(Vehicle.makeC);
	System.out.println(Vehicle.modelC);

}
}
