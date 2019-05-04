package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Words {

	public static void main(String[] args) {
	// Create an arrayList of words. Remove every word that ends with “e”.
		
		ArrayList<String> name = new ArrayList<String>();
		name.add("Muhammed");
		name.add("Asmit");
		name.add("Alexe");
		name.add("Helloe");
		
		Iterator<String> it=name.iterator();
		while(it.hasNext()) {
			String word=it.next();
			if(word.endsWith("e")) {
			it.remove();
}
		}
		System.out.println(name);
		
		
		
		

	}
	}

