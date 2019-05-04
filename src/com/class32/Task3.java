package com.class32;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Task3 {

	/*
	 * Create an HashSet of cities and add duplicates into it. Retrieve all values
	 * from hashset in 2 different ways. Retrieve all values in alphabetical order.
	 */
	public static void main(String[] args) {

		HashSet<String> hset = new HashSet<>();
		hset.add("Springfield");
		hset.add("Arlington");
		hset.add("Woodbridge");
		hset.add("Mclean");

		System.out.println("Print cities " + hset);
		hset.add("Arlington");
		hset.add("Springfield");

		System.out.println("----------------------");

		for (String cities : hset) {
			System.out.println(cities);

		}
		System.out.println("-------------------");

		List<String> tlist = new ArrayList<String>(hset);
		Collections.sort(tlist);
		System.out.println("Using an Array List with collections.sort() " + tlist);

	}

}
