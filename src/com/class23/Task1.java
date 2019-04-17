package com.class23;

public class Task1 {
	
	/*
	 * Create 1 class in which create a methods that will calculate the area of
			Rectangle
			Square
			Cube
			Use separate class to test your code
	 	*/
	
	public static void rectangle(int x, int y) {
		System.out.println("The area of rectangle is:");
		System.out.println(x*y);
	}
	public static void square(double x) {
		System.out.println("The area of square is: ");
		System.out.println(x*x);
	}
	public static void cube(int x) {
		System.out.println("The area of cube is:");
		System.out.println(6*(x*x));             // another formula is (length*width*height)
		
	}

}
