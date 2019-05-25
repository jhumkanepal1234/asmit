package com.class35;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
	
	/*
	 * How would handle InputMismatchException? 
	 * Input Mismatch Exception when user enters mismatch value then programmer expected.
	 */

	public static void main(String[] args) {
		
		int x=10;
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Input number");
		
		
		try {
			if( x==scan.nextInt()) {
				
			}
			System.out.println("Number match");
			
		} catch (InputMismatchException e) {
			System.out.println("Mismatch error");
		}
	}

}
