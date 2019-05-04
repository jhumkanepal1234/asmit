package com.class33;

import java.util.*;


public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create a map of a building. Store floor number and it is associated company name. 
		 * (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
			Check how many entries you have?
			Update company on a 4th floor
			Remove company on the 7th floor
			Print your map
		 */

		Map<Integer, String > map=new HashMap<>();
		//add entries(key+value)
		map.put(1, "Google");
		map.put(2, "Syntax");
		map.put(3, "Resturant");
		map.put(4, "Consultancy");
		map.put(5, "Syntax");
		map.put(6, "Fedex");
		map.put(7, "Resturant");
		
		System.out.println(map.size());
		map.replace(4, "Ups");
		map.remove(7);
		System.out.println(map);
		
	}

}
