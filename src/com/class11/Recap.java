package com.class11;

public class Recap {

	public static void main(String[] args) {
		
// let's create an array of names that will hold 5 elements and retrieve all values from it
		
	String [] names=new String[6];
	
	names[0]="Asel";
	names[1]="Awet";
	names[2]="Arif";
	names[3]="Wegas";
	names[4]="Dzmitri";
	names[5]="Shiva";   
	
	for (int i=0; i<names.length; i++) {
		System.out.println(names[i]);
	}		
		//2. Creating an array using array literal
	//                              0        1        2         3        4        6
		String[] studentNames= {"Shaban", "Bilal", "Mehmet", "Zakai", "Samir", "Frank"};
	
	System.out.println("-------------For Loop-------------");
		for (int i=0; i<=studentNames.length-1; i++) {
			System.out.println(studentNames[i]);
		}
		
		//retrieve values using: advanced for loop, for each loop, enhanced for loop
		System.out.println("-------------Advanced For Loop-------------");
		for (String student : studentNames) {
			System.out.println(student);
		}
	
	}

}
