package com.class24;

public class Task {
	
	/*
	 * Create 1 class with a static method that has 3 overloaded forms.
	 *  Then call each overloaded method with specific arguments and observe result.
	 */
	
	public static void task(int x, int y) {
		System.out.println(x*y);
	}
	
	public static void task(double x, double y) {
		System.out.println(x*y);
	}
	
	public static void task(int x, int y, int z) {
		System.out.println(x*y*z);
	}
	
	public static void main(String[] args) {
		Task t=new Task();
		task(1,2);
		task(2,2);
		task(1,2,3);
		
	}

}
