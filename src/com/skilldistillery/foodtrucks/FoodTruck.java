package com.skilldistillery.foodtrucks;

public class FoodTruck {
	private int truckId= (int) (Math.random() * 10000);
	private String name;
	private String type;
	private double rating;

	public FoodTruck(String name, String type, double rating) {
		super();
		
		this.name = name;
		this.type = type;
		this.rating = rating;
	}

	public FoodTruck() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String truckToString() {
		String truck = "TruckID: " + truckId + "\n" + "Name: " + name + "\n" + "Food Type: " + type + "\n" + "Rating: "
				+ rating + "\n";
		return truck;
	}

	public void showTruck() {
		String truckData = this.truckToString();
		System.out.println(truckData);
	}

}
