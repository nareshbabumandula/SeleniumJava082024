package com.java.oops;

class Car {
	
	// Object: Any entity which has state and behavior is called as an object e.g Person, Employee, Car, Remote, Mobile, Laptop, Bike, 
	// Dog, Cat, Tiger etc.
	
	// State/Properties/Characteristics/Variables of a Car
     String model;
     int yearMfg;
     String brand;
     
     // Behavior/Method of Car
     int speed(){
    	 //Method body or implementation or code logic
    	 return 70;
     }
     
     void brake(){
    	 System.out.println("Car has a brake..!");
     }
     
     void drive(){
    	 System.out.println("Car can be driven..!");
     }
 
}

public class Mercedez{
	
    public static void main(String[] args) {
    	// Create an instance for Car class
    	// Syntax -> Classname objRef = new Constructor();
		Car car = new Car();
		car.model="Mahindra XUV700 AX7L";
		car.yearMfg=2023;
		car.brand="Hyundai";
		
		System.out.println("Car model is : "+ car.model);
		System.out.println("Year of manufacture is : " + car.yearMfg);
		System.out.println("Brand name is : " + car.brand);
		
		int speed = car.speed();
		System.out.println("Car best recommended speed for fuel economy is : " + speed);
		car.brake();
		car.drive();
		
	}

}

