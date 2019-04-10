package com.class20;

public class AccessModifiers {

	public static void main(String[] args) {
		/*
		 * Create a method that will take a string and return array of words from that string. 
		 * Method should be available only within same class.
		 */

		Task3 obj=new Task3();
		String[] array=obj.getWordsFromString("Have a good night students");
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
			
			
		}
	}

private String[] getWordsFromString()String str){
	String[] words=str.split(" ");
	return words;
	
}
}
