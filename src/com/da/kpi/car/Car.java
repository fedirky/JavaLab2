package com.da.kpi.car;

import java.util.concurrent.ThreadLocalRandom;

public class Car {
	/*private int id;*/
	private Brand brand;
	private Model model;
	private int year;
	private Color color;
	private float price;
	private int regNumber;

	/*public int getId() { return id; }*/
	public Brand getBrand() { return brand; }
	public Model getModel() { return model; }
	public int getYear() { return year; }
	public Color getColor() { return color; }
	public float getPrice() { return price; }
	public int getRegNumber() { return regNumber; }

	public void printFullInfo() {
		System.out.println("===================================");

		System.out.println(/*"ID: " + this.id +
				"\n*/"Brand: " + this.brand +
				"\nModel: " + this.model +
				"\nYear: " + this.year +
				"\nColor: " + this.color +
				"\nPrice: " + this.price +
				"\nRegistration Number: " + this.regNumber);

		System.out.println("===================================");
	}

	public Car() {

		/*int idMin = 1000,
				idMax = 100000;
		this.id = ThreadLocalRandom.current().nextInt(idMin,idMax);*/

		this.brand = Brand.values()[ThreadLocalRandom.current().
				nextInt(0, Brand.values().length)];

		this.model = Model.values()[ThreadLocalRandom.current().
				nextInt(0, Model.values().length)];

		int yearMin = 1980,
				yearMax = 2023; //2023 is not included
		this.year = ThreadLocalRandom.current().nextInt(yearMin, yearMax);

		this.color = Color.values()[ThreadLocalRandom.current().
				nextInt(0, Color.values().length)];

		float priceMin = 10000,
				priceMax = 1000000;
		this.price = ThreadLocalRandom.current().nextFloat(priceMin, priceMax);

		int regNumMin = 1000,
				regNumMax = 10000; //10000 is not included
		this.regNumber = ThreadLocalRandom.current().nextInt(regNumMin,regNumMax);
	}
}
