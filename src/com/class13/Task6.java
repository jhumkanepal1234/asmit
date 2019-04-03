package com.class13;

public class Task6 {

	public static void main(String[] args) {
		/*
		 * You have a String a=“Is it saturday! Is it raining! Do we have a Java Class today?”
		 *  How would you find out how many sentences are in that String?
		 */

		String a="IS it saturday? Is it raining? Do we have a java class today?";
		
		String[] array=a.split("\\?");
        System.out.println(array.length);
        
		
	}
	}


