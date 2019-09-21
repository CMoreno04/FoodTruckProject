package com.skilldistillery.foodtrucks;


public class FoodTruckLot {
	private FoodTruck[] fudtrucks;
	private FoodTruck[] fudtruckRatings;
	private int numbtrucks = 0;

	private static int TruckLimit = 6;
	
	private double rate=0;
	
	public FoodTruckLot() {
		fudtrucks=new FoodTruck[TruckLimit];
	}
	
	public void addnotherTruck(FoodTruck t) {
		fudtrucks[numbtrucks]=t;
		numbtrucks++;
	}
	
	
	public void addTruckRating(Double t) {
		rate=t;
		rate+=rate;
		
	}
	
	public void getAverage() {
		double rate=this.rate;
		
		double average=rate/numbtrucks;
		
		System.out.println("The average rating is: "+average);
	}
	
	public FoodTruck[] getTrucks() {
	    FoodTruck[] truckCopy;
	    truckCopy = new FoodTruck[numbtrucks];
	    for(int i=0; i < numbtrucks; i++) {
	      truckCopy[i] = fudtrucks[i];
	    }
	    
	    return truckCopy;
	  }
	
	
}
