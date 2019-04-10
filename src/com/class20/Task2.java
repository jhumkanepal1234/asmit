package com.class20;

import com.class17.Task3;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create a method that will take a String and return whether String is
		 * palindrome or not. Method should available to all classes within your
		 * projects.
		 */
		 
		 

		Task3 str = new Task3();
		str.palindrome("Mom");
		str.palindrome("Bob");
		str.palindrome("Asmit");

	}

	public void palindrome(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		if (rev.equalsIgnoreCase(str)) {
			System.out.println(str + " is palindrome");
		} else {
			System.out.println(str + " is not palindrome");
		}
	}
}