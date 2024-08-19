package com.java.practice;

public class Truck implements Drivable,Maintainable {
	
	@Override
    public void accelerate() {
        System.out.println("The truck is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("The truck is braking.");
    }

    @Override
    public void changeOil() {
        System.out.println("Changing the truck's oil.");
    }

    @Override
    public void checkTires() {
        System.out.println("Checking the truck's tires.");
    }
	public static void main(String[] args) {
		 
Truck truck=new Truck();
truck.accelerate();
truck.brake();
truck.changeOil();
truck.checkTires();
	}

}
