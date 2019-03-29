package com.class12;

public class ForEachIn2D {

	public static void main(String[] args) {
		/*
		 * Create a grocery list: fruits{}
		 * 						  veggies{}
		 * 						  dairy{}
		 * Retrive all values using 2 different loops
		 */                       
		 
		String [][] groceryList= {
				{"Apple", "Grapes", "Mango", "Banana"},
				{"Potato", "Spinich", "cauliflower"},
				{"Milk", "Butter"}
		};
		
	
	for (String[] list : groceryList) {
		for (String item:list) {
			System.out.println(item);
		}
		System.out.println();
	}
	}
}
	


