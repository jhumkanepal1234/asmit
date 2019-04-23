package com.class26;

public class Car {
	
	public void drive() {
		System.out.println("Car drives");
	}

}

class BMW extends Car{
	public void drive() {
		System.out.println("BMW drives fast");
	}
	
}

class Toyota extends Car{
	public void drive() {
		System.out.println("Toyota drives safe");
	}
	
}
