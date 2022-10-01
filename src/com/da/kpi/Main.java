package com.da.kpi;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import com.da.kpi.car.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("You're Welcome!\n" +
				"Enter number of cars in your garage: ");
		int numOfCars = in.nextInt();

		ArrayList<Car> garage = new ArrayList<>(numOfCars);

		String lineDivider = "=============================\n";

		for(int i = 0; i < numOfCars; i++) {
			garage.add(new Car());

			System.out.println(lineDivider + garage.get(i));
		}

		int functionNumber;

		System.out.print("""
				\nIf you want to execute function A, then print '1';
				If you want to execute function B, then print '2';
				If you want to execute function C, then print '3;
				Your input:\040""");
		functionNumber = in.nextInt();

		ArrayList<Car> filteredArray = new ArrayList<>();

		switch (functionNumber) {
			case 1:
				System.out.print("Enter brand of cars: ");
				String keyBrand = in.next();

				filteredArray = Filter.FilterA(garage, keyBrand);
				break;
			case 2:
				System.out.print("""
						If you want SEDAN, then print 1
						If you want HATCHBACK, then print 2
						If you want ROADSTER, then print 3
						If you want PICKUP, then print 4
						If you want MICRO, then print 5
						If you want CABRIOLET, then print 6
						If you want SUPERCAR, then print 7
						If you want VAN, then print 8
						If you want TRUCK, then print 9
						Your input:\040""");


				Model In = null;
				functionNumber = in.nextInt();

				if (Objects.equals(functionNumber, 1)) {
					In = Model.SEDAN;
				} else if (Objects.equals(functionNumber, 2)) {
					In = Model.HATCHBACK;
				} else if (Objects.equals(functionNumber, 3)) {
					In = Model.ROADSTER;
				} else if (Objects.equals(functionNumber, 4)) {
					In = Model.PICKUP;
				} else if (Objects.equals(functionNumber, 5)) {
					In = Model.MICRO;
				} else if (Objects.equals(functionNumber, 6)) {
					In = Model.CABRIOLET;
				} else if (Objects.equals(functionNumber, 7)) {
					In = Model.SUPERCAR;
				} else if (Objects.equals(functionNumber, 8)) {
					In = Model.VAN;
				} else if (Objects.equals(functionNumber, 9)) {
					In = Model.TRUCK;
				}

				filteredArray = Filter.FilterB(garage, In);
				break;
			case 3:
				System.out.print("You chose function C." +
						"\nThis function prints array of cars of certain year and " +
						"that are more expensive that specified price. " +
						"\nPlease Enter the Year: ");
				int year = in.nextInt();

				System.out.print("Now Enter the price of car: ");
				float price = in.nextFloat();

				System.out.println("You entered year " + year +
						" and price " + price);

				filteredArray = Filter.FilterC(garage, year, price);
				break;
		}

		System.out.println("\nWe've found " + filteredArray.size() + " car(s).");

		for(var currentCar : filteredArray) {
			System.out.println(lineDivider + currentCar);
		}
	}
}
