package com.assignment;

public class Car {
	public static Car obj;
	public static Car obj1;
	public static Car obj2;
	public static Car obj3;
	String make;
	String model;
	int numberOfDoors;
	int topSpeed;
	double price;

	public Car(String make, String model, int doors, int speed, double price) {
		make = "make";
		model = "model";
		numberOfDoors = doors;
		topSpeed = speed;
		price = price;

		System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);

	}

	public Car(String make, String model, int speed, double price) {
		make = "make";
		model = "model";
		topSpeed = speed;
		price = price;
		System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);
	}

	public Car(int doors, int speed, double price) {
		numberOfDoors = doors;
		topSpeed = speed;
		price = price;

		System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);
	}

	public Car(String make, String model, int doors) {
		make = "make";
		model = "model";
		numberOfDoors = doors;

		System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);
	}

}
