package com.da.kpi;

import com.da.kpi.car.Car;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("You're Welcome!\n" +
				"Enter number of cars in your garage: ");

		int numOfCars = in.nextInt();

		ArrayList<Car> garage = new ArrayList<Car>();

		for(int i = 0; i < numOfCars; i++) {
			garage.add(new Car());
		}

		//constructor test, need to be commented
		for (Car currentCar : garage) {
			System.out.println(currentCar.toString());
		}
	}
}
