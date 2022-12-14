package com.da.kpi;

import com.da.kpi.car.Car;

import java.util.Scanner;
import java.util.Hashtable;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("You're Welcome!\n" +
				"Enter number of cars in your garage: ");

		int numOfCars = in.nextInt();

		Hashtable<Integer, Car> garage = new Hashtable<Integer, Car>();

		for(int i = 0; i < numOfCars; i++) {
			Car newCar = new Car();

			if(garage.put(newCar.getRegNumber(), newCar) != null) {
				System.out.println("This registration number: " +
						newCar.getRegNumber() + " is already used.");
			}
		}
		//constructor test, need to be commented
		Set<Integer> setOfKeys = garage.keySet();

		for (int key : setOfKeys) {
			System.out.println(garage.get(key).toString());
		}
	}
}
