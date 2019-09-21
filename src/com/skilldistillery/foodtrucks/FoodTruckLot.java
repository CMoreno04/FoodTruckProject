package com.skilldistillery.foodtrucks;


public class FoodTruckLot {
	private FoodTruck[] ftrucks;
	private int numbtrucks = 0;

	private static int TruckLimit = 6;
	
	public FoodTruckLot() {
		ftrucks=new FoodTruck[TruckLimit];
	}
	
	public void addnotherTruck(FoodTruck t) {
		ftrucks[numbtrucks]=t;
		numbtrucks++;
	}
	
	public FoodTruck[] getTrucks() {
	    FoodTruck[] truckCopy;
	    truckCopy = new FoodTruck[numbtrucks];
	    for(int i=0; i < numbtrucks; i++) {
	      truckCopy[i] = ftrucks[i];
	    }
	    
	    return truckCopy;
	  }
}
