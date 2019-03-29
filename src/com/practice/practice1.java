package com.practice;
import java.util.Scanner;
public class practice1 {

	public static void main(String[] args) {
		/*
		 * Write a java program that prints out true if ( x * y ) return a positive value. 
		 * Else prints out false if  (x * y) return a negative value.

		Step 1: Your program should ask "Please enter first number" - 
		for the 1st number and "Please enter second number"-for the 2nd number

		Step 2: Create the if condition to check the X and Y value validation for the sign value

		Step 3: If it is positive value user would get True if it negative value user would get false
		 */

		Scanner scan;
		int num1;
		int num2;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter the first number");
		num1=scan.nextInt();
		System.out.println("Please enter the second number");
		num2=scan.nextInt();
		
		
		if((num1*num2)>0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
			
		
	}

}
