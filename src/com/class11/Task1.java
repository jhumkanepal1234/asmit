package com.class11;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Create an array of cars and store 6 elements into it. 
		 * Using 2 different loops print all values from the array
		 */
		// using: for loop
		String[] cars= {"Hyundai", "Toyota", "Honda", "Bmw", "Volvo", "Audi"};
		System.out.println("-------------For Loop-------------");
		for (int i=0; i<=cars.length-1; i++) {
			System.out.println(cars[i]);
		}
		
		// using: advanced for loop
		System.out.println("-------------Advanced For Loop-------------");
		for (String brands : cars) {
			System.out.println(brands);
		}
	}

}
