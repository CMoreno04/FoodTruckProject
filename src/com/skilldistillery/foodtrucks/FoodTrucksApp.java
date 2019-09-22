package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTrucksApp {
	private FoodTruckLot trk = new FoodTruckLot();
	private FoodTruck[] trucks = trk.getTrucks();

	public static void main(String[] args) {
		FoodTrucksApp app = new FoodTrucksApp();

		app.go();
	}

	private void go() {
		Scanner kb = new Scanner(System.in);

		String name, type;
		double rating = 0.0;
		int j = 0, totRatings = 0, numTrks = 0;

		System.out.println("How many trucks will you be rating? ");
		numTrks = kb.nextInt();

		do {

			FoodTruck truck1 = new FoodTruck();
			kb.nextLine();
			System.out.println("\nEnter Food Truck  information: ");

			System.out.println("\nPlease provide the name of the truck, or input \"Quit\" to coninue: ");
			name = kb.nextLine();

			if (name.equalsIgnoreCase("Quit")) {
				break;
			}
			truck1.setName(name);

			System.out.println("\nPlease provide the type: ");
			type = kb.nextLine();
			truck1.setType(type);

			System.out.println("\nPlease enter your rating: 1-5 ");
			rating = kb.nextDouble();

			totRatings += rating;
			

			truck1.setRating(rating);
			trk.addnotherTruck(truck1);

			j++;
		} while (j < numTrks);

		trucks = trk.getTrucks();

		menu(totRatings, j);

		kb.close();
	}

	private void menu(double totRatings, int numTrks) {
		Scanner kb = new Scanner(System.in);
		int i = 0;
		do {

			System.out.println("\nPlease make a selection from the menu: 1-4.");
			System.out.println("1. Show All Trucks.");
			System.out.println("2. See Average Rating of Food Trucks.");
			System.out.println("3. See Highest Rated Truck.");
			System.out.println("4. Quit.");
			String input = kb.next();

			if (input.equals("1")) {
				displayFoodTrucks(trucks);
			}

			else if (input.equals("2")) {
				Double finalRtng = calculateAverage(totRatings, numTrks);
				System.out.print("\nThe Rating is: ");
				System.out.printf("%.1f", finalRtng);
			}

			else if (input.equals("3")) {
				System.out.println("\nThe Highest Rated truck is");
				getHighestRating(trucks);

			} else if (input.equals("4") || input.equalsIgnoreCase("Quit")) {
				System.out.println("\nGoodbye! ");
				break;
			}

			else {
				System.out.println("ERROR, TRY AGAIN!");
			}

		} while (i < 5);
		kb.close();
	}

	private void displayFoodTrucks(FoodTruck[] trucks) {
		for (FoodTruck foodTruck : trucks) {
			foodTruck.showTruck();
		}
	}

	private Double calculateAverage(double totRatings, int numTrks) {
		Double average = totRatings / numTrks;
		return average;
	}

	private void getHighestRating(FoodTruck[] truckHi) {
		double highest = truckHi[0].getRating();
		int highIndx = 0;

		for (int i = 0; i < trucks.length; i++) {

			if (truckHi[i].getRating() > highest) {
				highest = truckHi[0].getRating();
				highIndx = i;
			}
		}
		truckHi[highIndx].showTruck();
	}
}
