package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTrucksApp {

	public static void main(String[] args) {
		FoodTrucksApp app = new FoodTrucksApp();

		app.go();
	}

	private void go() {
		Scanner kb = new Scanner(System.in);
		String name = null, type = null;
		double rating = 0.0;

		FoodTruckLot trk = new FoodTruckLot();
		FoodTruck[] trucks = trk.getTrucks();

		System.out.println("Current number of trucks: " + trucks.length);

		System.out.println("Enter Food Truck 1 information: ");
		FoodTruck truck1 = new FoodTruck();

		

		System.out.println("Please provide the name: ");
		name = kb.nextLine();
		truck1.setName(name);

		System.out.println("Please provide the type: ");
		type = kb.nextLine();
		truck1.setType(type);

		System.out.println("Please provide the desired rating: ");
		rating = kb.nextDouble();
		truck1.setRating(rating);

		System.out.println("\nEnter Food Truck 2 information: ");
		FoodTruck truck2 = new FoodTruck();


		System.out.println("Please provide the name: ");
		name = kb.nextLine();
		truck2.setName(name);

		System.out.println("Please provide the type: ");
		type = kb.nextLine();
		truck2.setType(type);

		System.out.println("Please provide the desired rating: ");
		rating = kb.nextDouble();
		truck2.setRating(rating);

//		System.out.println("\nEnter Food Truck 3 information: ");
//		FoodTruck truck3 = new FoodTruck();
//		
//		System.out.println("Please provide the ID Number: ");
//		truckID = kb.nextLine();
//		truck3.setTruckId(truckID);
//		
//		System.out.println("Please provide the name: ");
//		name = kb.nextLine();
//		truck3.setName(name);
//		
//		System.out.println("Please provide the type: ");
//		type = kb.nextLine();
//		truck3.setType(type);
//		
//		System.out.println("Please provide the desired rating: ");
//		rating = kb.nextDouble();
//		truck3.setRating(rating);
//
//		System.out.println("\nEnter Food Truck 4 information: ");
//		FoodTruck truck4 = new FoodTruck();
//		
//		System.out.println("Please provide the ID Number: ");
//		truckID = kb.nextLine();
//		truck4.setTruckId(truckID);
//		
//		System.out.println("Please provide the name: ");
//		name = kb.nextLine();
//		truck4.setName(name);
//		
//		System.out.println("Please provide the type: ");
//		type = kb.nextLine();
//		truck4.setType(type);
//		
//		System.out.println("Please provide the desired rating: ");
//		rating = kb.nextDouble();
//		truck4.setRating(rating);
//
//		System.out.println("\nEnter Food Truck 5 information: ");
//		FoodTruck truck5 = new FoodTruck();
//		
//		System.out.println("Please provide the ID Number: ");
//		truckID = kb.nextLine();
//		truck5.setTruckId(truckID);
//		
//		System.out.println("Please provide the name: ");
//		name = kb.nextLine();
//		truck5.setName(name);
//		
//		System.out.println("Please provide the type: ");
//		type = kb.nextLine();
//		truck5.setType(type);
//		
//		System.out.println("Please provide the desired rating: ");
//		rating = kb.nextDouble();
//		truck5.setRating(rating);
		
		trk.addnotherTruck(truck1);
		trk.addnotherTruck(truck2);
//		trk.addnotherTruck(truck3);
//		trk.addnotherTruck(truck4);
//		trk.addnotherTruck(truck5);
		
		
		
		trucks=trk.getTrucks();		
		
		
		displayFoodTrucks(trucks);
		
		System.out.println("Current number of trucks: " + trucks.length);
		
		
		kb.close();
	}

	private void displayFoodTrucks(FoodTruck[] trucks) {
		for (FoodTruck foodTruck : trucks) {
			foodTruck.showTruck();
		}
	}
}
