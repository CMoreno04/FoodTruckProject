package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTrucksApp {
	FoodTruckLot trk = new FoodTruckLot();
	FoodTruck[] trucks = trk.getTrucks();

	public static void main(String[] args) {
		FoodTrucksApp app = new FoodTrucksApp();

		app.go();
	}

	private void go() {
		Scanner kb = new Scanner(System.in);
		String name = null, type = null;
		double rating = 0.0;
		int i = 0, j = 0;
		do {

			System.out.println("How many trucks will you be rating? ");
			int numTrks = kb.nextInt();

			do {

				FoodTruck truck1 = new FoodTruck();

				System.out.println("\nEnter Food Truck  information: ");

				System.out.println("\nPlease provide the name: ");
				name = kb.next();
				truck1.setName(name);

				System.out.println("\nPlease provide the type: ");
				type = kb.next();
				truck1.setType(type);

				System.out.println("\nPlease provide the desired rating: ");
				rating = kb.nextDouble();
				truck1.setRating(rating);
				trk.addTruckRating(rating);
				trk.addnotherTruck(truck1);
				j++;
			} while (j < numTrks);

			menu();
			break;

		} while (i < 5);

		kb.close();
	}

	private void displayFoodTrucks(FoodTruck[] trucks) {
		for (FoodTruck foodTruck : trucks) {
			foodTruck.showTruck();
		}
	}

	public void menu() {
		Scanner kb = new Scanner(System.in);
		FoodTruckLot trk = new FoodTruckLot();
		int i = 0;
		do {

			System.out.println("Please make a selection from the menu: 1-4.");
			System.out.println("1. Show All Trucks.");
			System.out.println("2. See Average Rating of Food Trucks.");
			System.out.println("3. See Highest Rated Truck.");
			System.out.println("4. Quit.");
			int input = kb.nextInt();

			if (input < 4) {
				switch (input) {

				case 1: {
					trucks = trk.getTrucks();
					displayFoodTrucks(trucks);
				}
					break;
				case 2:
					trk.getAverage();
					break;
				case 3:
					break;

				}
			}

			else if (input == 4) {
				break;
			}

		} while (i < 5);

	}
}
