package com.class3;
/* Create a java program and name it Temperature Check, 
 * Create variable to store temperature. Your program should check if temperature is below 32 
 * then it should print "Water will not freeze with temperature__".
 * Otherwise "Water will Not freeze with temperature__'.
 */

public class TemperatureCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=32;
		int b=50;
		if(a>b) {
			System.out.println("Water will freeze with temperature "+b+ ".");
		} else {
			System.out.println("Water will not freeze with temperature "+b+ ".");
		}

	}

}
