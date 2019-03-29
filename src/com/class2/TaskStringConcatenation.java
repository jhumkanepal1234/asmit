package com.class2;

public class TaskStringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Asmit";

		String lastName = "Nepal";

		char grade = 'A';

		String city = "Woodbridge";

		String state = "VA";

		String phoneNumber = "571-213-5416";
		
		//(long phoneNumber= 5712135416l; We can use this long if we don't have character. But I have character thats why I am using String.)

		/*
		 * Print:
		 */
		// My name is Asmit and my last name is Nepal.
		// I am A student
		// I live in a city of Woodbridge in a state of Va
		// My phone number is

		System.out.println("My name is "+name+" and my lastname is " +lastName+ ".");
		System.out.println("I am " +grade+ " student" + ".");
		System.out.println("I live in a city of " +city+ " in " +state+ ".");
		System.out.println("My phoneNumber is " +phoneNumber+ ".");

	}

}
