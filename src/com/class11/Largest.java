package com.class11;

public class Largest {

	public static void main(String[] args) {
		// create an array of integers and find largest number
		
		int[] num= {1, 2, 3, 4, 5};
		int largest = num[0];
		
		for (int i=0; i<num.length; i++) {
			System.out.println(num[i]);
			
			if (num[i]>largest) {
				largest=num[i];
			}
			
		}
		System.out.println("The largest number is "+largest);
	}

}
