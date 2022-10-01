package com.da.kpi;

import java.util.ArrayList;

import com.da.kpi.car.*;

public class Filter {
	public static ArrayList<Car> FilterA(ArrayList<Car> garage, String keyBrand) {
		ArrayList<Car> resultArray = new ArrayList<>();

		for(var currentCar : garage) {
			if (keyBrand.equals(currentCar.getBrand().toString())) {
				resultArray.add(currentCar);
			}
		}

		return resultArray;
	}

	public static ArrayList<Car> FilterB(ArrayList<Car> garage, Model model) {
		ArrayList<Car> resultArray = new ArrayList<>();

		for (int i = 0; i < garage.size(); i++) {
			if (garage.get(i).getModel() == model) {
				resultArray.add(garage.get(i));
			}
		}

		return resultArray;
	}

	public static ArrayList<Car> FilterC(ArrayList<Car> garage,
										 int year, float price) {
		ArrayList<Car> resultArray = new ArrayList<>();

		for(Car currentCar : garage) {
			if(currentCar.getYear() == year && currentCar.getPrice() > price) {
				resultArray.add(currentCar);
			}
		}

		return resultArray;
	}
}
