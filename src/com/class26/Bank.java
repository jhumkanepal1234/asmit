package com.class26;

public class Bank {
	
	/*
	 * 1. A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and Bank C respectively.
	 *  We have to print the money deposited by him in a particular bank. 
	 *  Create a class ‘Bank’ with a method ‘getBalance’ which returns 0. 
	 *  Make three subclasses named ‘BankA’, ‘BankB’ and ‘BankC’ with a method 
	 *  with the same name ‘getBalance’ which returns the amount deposited in that particular bank. 
	 *  Call the method ‘getBalance’ by the object of each of the three banks.

2. Write program in class A has final display method and try overload and override this method and observe result .
	 */

	public void getBalance(int a) {
		System.out.println(a);
		
	}
}
class BankA extends Bank{
	
	public void getBalance(int b) {
		System.out.println(b);
	}
}
class BankB extends Bank {
	
	public void getBalance(int c) {
		System.out.println(c);
	}
}

class BankC extends Bank{
	
	public void getBalance(int d) {
		System.out.println(d);
	}
}






