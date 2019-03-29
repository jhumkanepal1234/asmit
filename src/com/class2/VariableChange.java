package com.class2;

public class VariableChange {
	public static void main(String[] args) {
	//values of variables can be changed 	
		String name = "Asmit";

		String lastName = "Nepal";

		char grade = 'B';
		//char grade='A'; do not work // Asmit got A grade from B
		grade='A';

		String city = "Woodbridge";
		city="Arlington"; //Asmit moved to Arlington
		
		System.out.println(name);
		System.out.println(grade);
		System.out.println(city);




	}

}
