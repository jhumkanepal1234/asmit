package com.class4;
/*
 * Create a Java program and store variables to store mortgage rate and mortgage price. 
 * First program should check if rate is higher than 4.5 user will not buy a house, otherwise user will consider buying. 
 * Once user decides to buy a house, if price of the house is larger than 200000 than user will take a loan, 
 * otherwise user will pay cash.
 */
import java.util.Scanner;
public class MorgageRate {

	public static void main(String[] args) {
		
		int rate;
		int price;
		double avgrate=4.5;
		int avgprice=200000;
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter rate");
		rate=input.nextInt();
		
		//Scanner input2=new Scanner(System.in);
		System.out.println("Please enter price");
		price=input.nextInt();
		
		if(rate<avgrate) {
			System.out.println("User will buy a house");
			if (price<avgprice) {
				System.out.println("Buy with cash");
			}else {
				System.out.println("Will take a loan");
			}
		}else {
			System.out.println("User will not buy a house");
		}
		

	}

}
