package com.assignment;
import java.util.Scanner;

public class Task2Assignment {

	public static void main(String[] args) {
		/*
		 * Program to find largest number among three numbers using nested if provided by a user 
		 * (numbers must be distinct)
		 */
		int num1;
		int num2;
		int num3;
		
		Scanner sc=new Scanner(System.in);
			System.out.println("Please enter the distinct numbers");
			num1=sc.nextInt();
			num2=sc.nextInt();
			num3=sc.nextInt();
			
				
			if(num1>num2) {	
			if(num1>num3) {
					System.out.println(num1+ " is the largest number");
					
			}else {
				System.out.println(num3+ " is the largest number");
			}
			}else { //assuming num>num1
			
			 if (num2>num3) {
				 System.out.println(num2+ " is the largest number");
			 }else {
				System.out.println(num3+ " is the largest number");
			}
			 
			}
	}
	
}

