package com.java.oops;

public class PVR implements Theatre{

	public static void main(String[] args) {
		PVR pvr = new PVR();
		pvr.carParking(100);
		pvr.bikeParking(150);
		pvr.soundSystem(true);
		pvr.emergencyExit(5);
		pvr.canteen(20);
		pvr.fireandSafety("entire buiding");
		pvr.displayTheatreName("PVR");
		Theatre.printTheatreInfo();
		pvr.onlineTicketBooking();
		
		System.out.println(pvr.MAX_BIKE_PARKING);
		System.out.println(pvr.MAX_CAR_PARKING);
		System.out.println(pvr.MAX_EMERGENCY_EXITS);
	}


	@Override
	public void carParking(int numberOfCars) {
		System.out.println("Number of cars parked: " + numberOfCars);
	}

	@Override
	public void bikeParking(int numberOfBikes) {
		System.out.println("Number of bikes parked: " + numberOfBikes);
	}

	@Override
	public void soundSystem(boolean isSoundSytemOn) {
		if (isSoundSytemOn) {
			System.out.println("The sound system is ON");
		} else {
			System.out.println("The sound system is OFF");
		}
	}

	@Override
	public void emergencyExit(int numberOfExits) {
		System.out.println("Number of emergency exits available : "+ numberOfExits);
	}

	@Override
	public void fireandSafety(String safetyProtocol) {
		System.out.println("Fire and Safety protocol being followed for the : " + safetyProtocol);
	}

	@Override
	public void canteen(int availbleItems) {
		System.out.println("Number of items available in the canteen : " +availbleItems);
	}

	@Override
	public void seatingCategories(String categoryType, int numberOfSeats) {
		System.out.println("Seating Category : " + categoryType + "| number of seats avaiable : " + numberOfSeats);
	}
	
	public void onlineTicketBooking() {
		System.out.println("Online ticket booking facility is available");
	}

}
