package com.class36;

public class Task1 {
	
	public static void main(String[] args) {
		// create an exception: when user it trying to withdraw larger amount that the balance
	    //throw an exception saying “You do not have enough money”
		
		getMoney(2000, 2500);
	}
	 public static void getMoney(double balance, double desiredAmount) {
		 if(balance>desiredAmount) {
			 System.out.println("Please take the money");
		 }
		 else {
			 throw new ArthemeticException("Sorry! you don't have enough balance");
		 }

	}

}
