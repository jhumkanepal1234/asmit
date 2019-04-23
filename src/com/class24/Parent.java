package com.class24;

public class Parent {

	public void love() {
		System.out.println("Parents love");
	}
}
class Child extends Parent{
	
	public void love() {
		System.out.println("Child love");
	}
}