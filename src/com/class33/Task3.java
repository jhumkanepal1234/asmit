package com.class33;
import java.util.*;
public class Task3 {

	public static void main(String[] args) {
		/*
		 * Create a map of countries with its capital. 
			Print all keys and values from a country map using for each loop and iterator.
			Print all values from a country map using for each loop and iterator.
		 */
		
		Map<String, String> map=new HashMap<>();
		map.put("Nepal", "Kathmandu");
		map.put("Pakistan", "Islamabad");
		map.put("Usa", "Dc");
		map.put("France", "Paris");
		map.put("Russia", "Mascow");
		
		Set <String> keys=map.keySet();
		
		System.out.println("--------Using for each loop--");
		for (String key: keys) {
			System.out.println(key+": "+map.get(key));
		}
		System.out.println("---------Using iterator--------------");
		Iterator<String> keysIt=keys.iterator();
		while(keysIt.hasNext()) {
			String key=keysIt.next();
			System.out.println(key+": "+map.get(key));
		}
		System.out.println("------------using loop----------------");
		Collection <String > valCol=map.values();
		for (String value: valCol) {
			System.out.print(value+", ");
		}
		Iterator<String> itValues=valCol.iterator();
		while(itValues.hasNext()) {
			System.out.print(itValues.next()+", ");
		}
		
		
		
	}

}
