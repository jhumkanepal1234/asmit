package com.class23;

public class ConstructorOverloading {
	
	ConstructorOverloading(){
		System.out.println("I am constructor with no parameters");
	}
	ConstructorOverloading(String str){
		System.out.println("I am constructor with String parameters");
	}
	ConstructorOverloading(String str, String str2){
		System.out.println("I am constructor with two string  parameters");
	}
	ConstructorOverloading(int a){
		System.out.println("I am constructor with integer parameters");
	}

}
