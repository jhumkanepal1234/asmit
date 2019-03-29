package com.class4;
import java.util.Scanner;
public class DmvRepresentative {
	public static void main(String []args) {
	int age;
	
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter your age");
	age=input.nextInt();
	
	if(age>18) {
		System.out.println("I will provide you a driver lisence");
	}else {
		System.out.println("I will provide you a lerners permit");
	}
}	
}
