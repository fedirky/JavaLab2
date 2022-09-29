package com.da.kpi.car;

import java.util.concurrent.ThreadLocalRandom;

public class Car {
	private int id;
	private Brand brand;
	private Model model;
	private int year;
	private Color color;
	private float price;
	private int regNumber;

	public int getId() { return id; }
	public Brand getBrand() { return brand; }
	public Model getModel() { return model; }
	public int getYear() { return year; }
	public Color getColor() { return color; }
	public float getPrice() { return price; }
	public int getRegNumber() { return regNumber; }


	public String toString() {
		String info = new String();

		info = "ID: " + id +
				"\nBrand: " + brand +
				"\nModel: " + model +
				"\nYear: " + year +
				"\nColor: " + color +
				"\nPrice: " + price +
				"\nRegistration Number: " + regNumber;

		return info;
	}

	public Car() {

		/*int idMin = 1000,
				idMax = 100000;
		id = ThreadLocalRandom.current().nextInt(idMin,idMax);*/

		brand = Brand.values()[ThreadLocalRandom.current().
				nextInt(0, Brand.values().length)];

		model = Model.values()[ThreadLocalRandom.current().
				nextInt(0, Model.values().length)];

		int yearMin = 1980,
				yearMax = 2023; //2023 is not included
		year = ThreadLocalRandom.current().nextInt(yearMin, yearMax);

		color = Color.values()[ThreadLocalRandom.current().
				nextInt(0, Color.values().length)];

		float priceMin = 10000,
				priceMax = 1000000;
		price = ThreadLocalRandom.current().nextFloat(priceMin, priceMax);

		int regNumMin = 1000,
				regNumMax = 10000; //10000 is not included
		regNumber = ThreadLocalRandom.current().nextInt(regNumMin,regNumMax);
	}
}
