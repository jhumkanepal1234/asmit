package com.class13;

public class Task5 {

	public static void main(String[] args) {
		/*
		 * Create a String that should be combination of letters, numbers and special characters.
		 *  Find out how many alpha characters are there in the String.
		 */

			String str="Syntax! students batch4 are 100% tester";
			String newstr= str.replaceAll("[^A-Za-z]", "");
	        System.out.println(newstr.length());
	}

}
