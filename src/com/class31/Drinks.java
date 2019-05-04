package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

import com.assignment.array;

public class Drinks {

public static void main(String[] args) {
		
		ArrayList<String> drinks=new ArrayList<>();
		drinks.add("tea");
		drinks.add("coffee");
		drinks.add("milk");
		drinks.add("soda");
		
		for (int i=0; i<drinks.size(); i++) {
			String drink=drinks.get(i);
			if(drink.contains("a") || drink.contains("e")) {
				drinks.set(i, "water");
			}
		}
		System.out.println(drinks);
	}
}