package com.class11;

public class Task6 {

	public static void main(String[] args) {
		/*
		 * Create an array of cars: American cars, German cars, Korean cars, Italian car.
		 * Then retrieve all values from that array.
		 */

		String[][] cars= {
                {"Jeep", "Ford", "Chevrolet", "Lincoln"},
                {"Audi", "BMW", "Volkswagen", "Opel", "Mecedes"},
                {"Hyundai", "Kia", "Pyeonghwa", "Daewoo"},
                {"Fiat", "Ferrai", "Alfa Romeo", "Lancia", "Lamborgini", "Maserati"}
	};
for (int i=0; i<cars.length; i++) {
            
            for (int j=0; j<cars[i].length; j++) {
                System.out.print(cars[i][j]+"  ");
            }
            System.out.println();
	}
}
}
