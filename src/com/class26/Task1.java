package com.class26;

public class Task1 {
	
	/*
	 * Write program as a student class that has instance variables name and address.
	 *  Create a constructor that will initialize those variables. Print name & address of given  student by the displayInfo method.

	 */
	
	String name;
	String address;
	
	Task1(){
		name="Asmit";
		address="Woodbridge";
	}
	public void displayInfo() {
		System.out.println("My name is "+name+" and my address is "+address);
	}
	public static void main(String[] args) {
		Task1 obj=new Task1();
		obj.displayInfo();
		
	}
}
