package com.class30;

import java.util.ArrayList;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Create a generic ArrayList that will store 5 names into it. Find out whether
		 * the given ArrayList is empty or not? Check whether the specific name is
		 * present in an ArrayList or not? Find the size of your arrayList and print all
		 * values from that
		 */

		ArrayList<String> generic = new ArrayList<String>();
		generic.add("Ali");
		generic.add("Asmit");
		generic.add("Alex");
		generic.add("Tayab");
		generic.add("Jeisson");

		System.out.println(generic.isEmpty());
		System.out.println(generic.size());
		System.out.println(generic.contains("Asmit"));

		for (String names : generic) {
			System.out.println(names);

		}

	}
}
