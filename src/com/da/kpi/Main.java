package com.da.kpi;

import com.da.kpi.car.Car;
import com.da.kpi.car.Model;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

	public static ArrayList<Car> functionC(ArrayList<Car> garage, int year, float price) {
		ArrayList<Car> array = new ArrayList<Car>();
		for(Car currentCar : garage) {
			if(currentCar.getYear() == year && currentCar.getPrice() > price) {
				array.add(currentCar);
			}
		}
		return array;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("You're Welcome!\n" +
				"Enter number of cars in your garage: " );

		int numOfCars = in.nextInt();

		ArrayList<Car> garage = new ArrayList<Car>();

		for(int i = 0; i < numOfCars; i++) {
			garage.add(new Car());
		}

		int function_number;

		for (Car currentCar : garage) {
			System.out.println(currentCar.toString());
		}
		System.out.print("If you want to execute function A, then print '1'.");
		System.out.print("\nIf you want to execute function B, then print '2'.");
		System.out.print("\nIf you want to execute function C, then print '3': ");

		function_number = in.nextInt();
		switch (function_number) {
			case 1:
				//function A
				break;
			case 2:
				//function B

				/*if(Objects.equals(function_number, 'B')){
			System.out.print("If you want SEDAN, then print 1\n"
					+"If you want HATCHBACK, then print 2\n"
					+"If you want ROADSTER, then print 3\n"
					+"If you want PICKUP, then print 4\n"
					+"If you want MICRO, then print 5\n"
					+"If you want CABRIOLET, then print 6\n"
					+"If you want SUPERCAR, then print 7\n"
					+"If you want VAN, then print 8\n"
					+"If you want TRUCK, then print 9:\n");
			Model In = null;
			function_number = in.next().charAt(0);
			if (Objects.equals(function_number, '1')){
				In = Model.SEDAN;
			}
			else if (Objects.equals(function_number, '2')){
				In = Model.HATCHBACK;
			}
			else if (Objects.equals(function_number, '3')){
				In = Model.ROADSTER;
			}
			else if (Objects.equals(function_number, '4')){
				In = Model.PICKUP;
			}
			else if (Objects.equals(function_number, '5')){
				In = Model.MICRO;
			}
			else if (Objects.equals(function_number, '6')){
				In = Model.CABRIOLET;
			}
			else if (Objects.equals(function_number, '7')){
				In = Model.SUPERCAR;
			}
			else if (Objects.equals(function_number, '8')){
				In = Model.VAN;
			}
			else if (Objects.equals(function_number, '9')){
				In = Model.TRUCK;
			}

			for (int i = 0; i < garage.size(); i++) {
				if (garage.get(i).getModel() == In){
					System.out.print(garage.get(i).toString());
				}
			}
		}
		*/
				break;
			case 3:
				System.out.print("You chose function C.\nThis function prints array of cars of certain year and that are more expensive that specified price. \nPlease Enter the Year: ");
				int year = in.nextInt();
				System.out.print("\nNow Enter the price of car: ");
				float price = in.nextFloat();
				System.out.print("\nYou entered year " + year + " and price " + price + "\n");
				ArrayList<Car> functionResultArray = functionC(garage, year, price);
				for (Car currentCar : functionResultArray) {
					System.out.print(currentCar.toString());
				}
				System.out.print("The total number of cars with year = " + year + " and price = " + price + " is " + functionResultArray.size());
		}
	}
}