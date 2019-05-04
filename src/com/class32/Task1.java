package com.class32;

import java.util.ArrayList;
import java.util.Collections;

public class Task1 {
	/*
	 * Create an ArrayList of Strings and using Collections class sort the values of
	 * that ArrayList.
	 */

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("are");
		list.add("fruits");
		list.add("best");
		list.add("Apples");
		

		Collections.sort(list);

		System.out.println(list);
	}

}
