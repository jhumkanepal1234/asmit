package com.class4;

public class NestedIf {
/*
 * Write a program to check work eligibility
 * If user is younger than <16 __. not allowed to work
 * Otherwise  __. allow to work. If user is younger than 64 __> go to work
 *                     otherwise __. enjoy your life 
 */
	public static void main(String[] args) {
		
		int age =20;
		int eligableAge=16;
		int retirementAge=64;
		
		if (age<eligableAge) {
			System.out.println("Your are to young, no work for you");
		}else {
			System.out.println("You are eligible to work");
			if (age<retirementAge) {
				System.out.println("Go to work");
			}else {
				System.out.println("Don't work, enjoy your life");
			}
		}

	}

}
