package com.da.kpi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("You're Welcome!\n" +
				"Enter number of cars in array: ");

		int numOfCars = in.nextInt();

		ArrayList<Car> garage = new ArrayList<>(numOfCars);

		for(int i = 0; i < numOfCars; i++) {
			Car newCar = new Car();
			garage.add(newCar);
		}

		for(int i = 0; i < numOfCars; i++) {
			garage.get(i).printFullInfo();
		}
	}
}
