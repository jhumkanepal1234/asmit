package com.assignment;
import java.util.Scanner;
public class LargestOfThreeAssignment {
/*
 * Write a program to find largest of three double values using if-else.
 * if provided by a user (numbers must be distinct)
 */
	public static void main(String[] args) {
		
		double num1;
		double num2;
		double num3;
		
		Scanner sc=new Scanner(System.in);
			System.out.println("Please enter 3 distinct values");
			num1=sc.nextDouble();
			num2=sc.nextDouble();
			num3=sc.nextDouble();
				
				
			
				
				
				
				if(num1>num2 && num1>num3) {
					System.out.println(num1+" is the greater number");
				
					
				}else if(num2>num1 && num2>num3) {
					System.out.println(num2+" is the greater number");
				}else if(num3>num1 && num3>num2) {
					System.out.println(num3+ " is the greater number");
				}
					
					
				
	}

}
