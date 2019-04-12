package com.groupStudy;

public class ForLoop {

	public static void main(String[] args) {
		// Find the factorial numbers of 7
		int x=7;
		int factorial=1;
		
		for(int i=1; i<=7; i++) {
		factorial=factorial*i;	
		}
		System.out.println("The factorial number of "+x+" is "+factorial); // This is the way to do.
		
		// this is what we are looking for answer to be. We are multiplying from 7 and looping the multiples until 1
		System.out.println("The factorial number of "+x+" is "+7*6*5*4*3*2*1); 
	}

}
