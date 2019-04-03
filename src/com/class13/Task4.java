package com.class13;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * Create a String that will hold a sentence. Write a program to get a new String without any spaces.
		 */

		String str="Saturday is a coding day";
		
		String[] array=str.split(" ");
        System.out.println("The length of the array is "+array.length);
        for(String substring: array) {
            System.out.println(substring);
	}

}
}
