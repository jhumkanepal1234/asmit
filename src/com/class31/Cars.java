package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Cars {
	public static void main(String[] args) {
		
	
/*
 * Create an arraylist of cars and retrieve all the values using 4 different ways.
 */
	
	ArrayList<String> car = new ArrayList<String>();
	car.add("Honda");
	car.add("Hyundai");
	car.add("BMW");
	car.add("Nissan");
	
	//1 way 
	System.out.println("-----------1 way----------");
	for(int i=0; i<car.size(); i++) {
		System.out.println(car.get(i));
	}
	// 2nd way
	System.out.println("-----------2 way----------");
	for (Object a: car) {
		System.out.println(a);
	}
	System.out.println("-----------3 way----------");
	Iterator<String> it=car.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("-----------4 way----------");
	int b=0;
	
	while(car.size()>b) {
		String myCar=car.get(b);
		System.out.println(myCar);
		b++;
	}
	
}
	
}
