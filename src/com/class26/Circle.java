package com.class26;

public class Circle extends Shape {
	
	// area of circle pi r^2

	Circle(int radius) {
		super(radius);
		System.out.println("The area of circle is "+3.14*(radius*radius));
	}
	
	public static void main(String[] args) {
		Circle obj=new Circle(5);
		
	}

}

