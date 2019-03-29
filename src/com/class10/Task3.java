package com.class10;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * .Create an array of words: Java, Saturday, day, coding, is. 
		 * Print the following sentence using element of array: “Saturday is Java coding Day”.
		 * if we want length
		 */ 

		String[] names= {"Java", "Saturday", "day", "coding", "is"};
		System.out.println(names[1]+" "+names[4]+" "+names[0]+" "+names[3]+" "+names[2]+".");
		
		int size=names.length;
		System.out.println("The size of an array is "+size);
	}

}
