package com.java.oops;

public interface Theatre {
	
	int MAX_CAR_PARKING=100;
	int MAX_BIKE_PARKING=200;
	int MAX_EMERGENCY_EXITS=5;
				
	void carParking(int numberOfCars);
	void bikeParking(int numberOfBikes);
	void soundSystem(boolean isSoundSytemOn);
	void emergencyExit(int numberOfExits);
	void fireandSafety(String safetyProtocol);
	void canteen(int availbleItems);
	void seatingCategories(String categoryType, int numberOfSeats);
	
	static void printTheatreInfo() {
		System.out.println("This is a static method providing the theatre information..!");
	}
	
	default void displayTheatreName(String theatreName) {
		System.out.println("Name of the movie theatre is : " + theatreName);
	}

}
