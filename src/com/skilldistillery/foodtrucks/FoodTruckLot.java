package com.skilldistillery.foodtrucks;

public class FoodTruckLot {
	private FoodTruck[] fudtrucks;
	private int numbtrucks = 0;

	private static int TruckLimit = 1000;

	public FoodTruckLot() {
		fudtrucks = new FoodTruck[TruckLimit];
	}

	public void addnotherTruck(FoodTruck t) {
		fudtrucks[numbtrucks] = t;
		numbtrucks++;
	}

	public FoodTruck[] getTrucks() {
		FoodTruck[] truckCopy;
		truckCopy = new FoodTruck[numbtrucks];
		for (int i = 0; i < numbtrucks; i++) {
			truckCopy[i] = fudtrucks[i];
		}

		return truckCopy;
	}

}
