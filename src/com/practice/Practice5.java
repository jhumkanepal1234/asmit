package com.practice;

public class Practice5 {
	//Method in Java
	//Methods with Parameters and without
	//Methods with return values and without

	public static void main(String[] args) {
	// // Create a method that will take 2 parameters as a numbers and prints which number is larger.
		
		Practice5 num=new Practice5();
		num.largestNumber(10,50);
		
	} 
		
		void largestNumber(int x, int y) {
			if(x>y) {
				System.out.println("Number 1 is the largest");
			}else {
				System.out.println("Number 2 is the largest");
			}
		 }
		
		
	}


