package com.class17;

public class Task {

	public static void main(String[] args) {
		
		// Create a method that will take a number and prints whether the number is even or odd.
		Task num = new Task();
        num.evenOrOdd(11);
        
    }
    void evenOrOdd(int num) {
        
        if(num % 2 ==0) {
            System.out.println("The number is Even");
        }else {
            System.out.println("The number is Odd");
        }
		
		
	        	
		

	}

}
