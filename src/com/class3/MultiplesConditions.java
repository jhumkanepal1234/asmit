package com.class3;

public class MultiplesConditions {

	public static void main(String[] args) {
		int day=15; 
		//if we don't have any days mentioned there we get the last one. I don't know. Else statement at last line.
		
		if (day==1) {
			System.out.println("Monday");
		}else if (day==2) {
			System.out.println("Tuesday");
		}else if (day==3) {
			System.out.println("Wednesday");
		}else if (day==4) {
			System.out.println("Thursday");
		}else if (day==5) {
			System.out.println("Friday - Its a fun day");
		}else if (day==6) {
			System.out.println("Saturday - coding day");
		}else if (day==7) {
			System.out.println("Sunday - again coding day");
		}else {
			System.out.println("I don't have that day");
		}
			

	}

}
