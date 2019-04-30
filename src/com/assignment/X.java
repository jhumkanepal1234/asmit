package com.assignment;

 public abstract class X {

	public abstract void m1();

	public abstract void m2();

}

class Y extends X {

	public void m1() {
		System.out.println("abstract method1 implementation in main class");
	}

	public void m2() {
		System.out.println("abstract method2 implementation in main class");

	}

}

