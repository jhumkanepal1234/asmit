package com.class19;

//  Write a program to find the maximum and minimum value of an array.

public class Task1 {

	static int minOfValues(int[] x) {

		int min = x[0];

		for (int y : x) {

			if (y < min) {
				min = y;
			}
		}

		return min;

	}

	static int maxOfValues(int[] array) {

		int max = array[0];

		for (int j = 0; j < array.length; j++) {

			if (array[j] >= max) {

				max = array[j];

			}

		}

		return max;

	}
}
