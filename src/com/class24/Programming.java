package com.class24;

import com.class19.MainClass;

public class Programming {
	
	/*
	 * 1. Create a class named ‘Programming’. While creating an object of the class, 
	 * if nothing is passed to it, then the message “I love programming languages” should be printed.
	 *  If some String is passed to it, then in place of “programming languages” the value variable should be printed.
	 *   Example, if we pass “Java”, then “I love Java” should be printed.
	 */
	
	public Programming() {
	    System.out.println("I love proggraming languages");
	}
	
	public Programming(String a) {
	    System.out.println("I love "+a);
	}
	
	public static void main(String[] args) {
	    Programming p1 = new Programming();
	    Programming p2 = new Programming("Java");
	}
	

}
