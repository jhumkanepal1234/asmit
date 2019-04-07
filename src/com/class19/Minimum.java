package com.class19;

public class Minimum {
/* 
 * Create a class Called Minimum

with in it crate a method called minOfValues

make it static

From your previous Applicaion class call the method and pass an array argument

and print out the result
 */


	
	
	    
	    
	    static int minOfValues(int[] x ){
	        
	        int min = x[0];
	        
	        for(int y: x) {
	            
	            if(y<min) {
	                min = y;
	            }
	        }
	        
	        
	        return min;        // I have not created on application. Another part is left. Continue at home
	    }

		public void print() {
			// TODO Auto-generated method stub
			
		}
}
	        
	        
	        

