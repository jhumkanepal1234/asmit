package com.class24;

public class Task1 {
	/*
	 * Create 1 class with a private method that has 3 overloaded forms.
	 *  Then call each overloaded method with specific arguments and observe result
	 */

	public static void main(String[] args) {
		Task1 obj=new Task1();
		obj.add(3, 2);
		obj.add(2.2, 3);
		obj.add(3, 4, 5);
		
	}

	private  void add(int a, int b) {
		System.out.println(a+b);

	}

	private void add(double a, int b) {
		System.out.println(a+b);

	}

	private void add(int b, int a,int c) {
		System.out.println(a+b+c);

	}
}
