package com.class19;

public class ContinuueTask1 {

	public static void main(String[] args) {

		int my_array[] = { -1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		System.out.println("Printing the minimum value");

		System.out.println(Minimum.minOfValues(my_array));
		System.out.println(Minimum.minOfValues(array));

		Minimum min = new Minimum();
		min.print();

	}

}
