package com.class16;

public class Car {
	
	
	 String make, model, color;
	 
	int door, wheels;
	public static void main(String[] args) {
		
		// ClassName VariableName=new ClassName();
		Car car1=new Car();
		car1.make="Honda";
		car1.model="Civic";
		car1.color="Black";
		car1.door=4;
		car1.wheels=4;
		
		// car honda has 4 wheels
		System.out.println("Car "+car1.make+" has "+car1.wheels+" wheels");
		car1.drive();
		car1.reserve();
		car1.stop();
		
		
		//2 object
		Car car2=new Car();
		car2.make="Tesla";
		car2.model="X";
		car2.color="Blue";
		car2.door=4;
		car2.wheels=4;  
		
		
	System.out.println("-----------------for car2----------------");	
		// My car is blue Tesla
		System.out.println("My car is "+car2.color+" "+car2.make);
	
	car2.drive();
	car2.reserve();
	car2.stop();
	}
	
	void drive() {
		System.out.println("Car can drive");
	}
	
	void reserve() {
		System.out.println("Car can reserve");
	}
	void stop() {
		System.out.println("Car can stop");
	}
	
	
	
		
		
		
		
		
	}


