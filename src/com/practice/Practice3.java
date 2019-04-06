package com.practice;

public class Practice3 {
	//// Create a method that will take a number and prints whether the number is even or odd.
	//Method in Java
	//Methods with Parameters and without
	//Methods with return values and without

	public static void main(String[] args) {
		
		Practice3 num= new Practice3();
		num.evenOrOdd(8);
		
	}
	void evenOrOdd(int num){
		if(num%2==0) {
			System.out.println("The number is even");
		}else {
			System.out.println("The number is odd");
		}
	}
		
			
}
