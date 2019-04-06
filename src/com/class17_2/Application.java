package com.class17_2;

import com.class17.Calculator;

public class Application {

	public static void main(String[] args) {
		
		ScannerMethod scnMthd = new ScannerMethod();
		
		Calculator flag=new Calculator();
		flag.sum(10,20);
		System.out.println(flag.sum(10, 20));
		
		flag.sub(20,10);
		System.out.println(flag.sub(20, 10));
		
		flag.mult(5,5);
		System.out.println(flag.mult(5, 5));
		
		flag.div(10,5);
		System.out.println(flag.div(10, 5));
		
		
		

	}
	

}
