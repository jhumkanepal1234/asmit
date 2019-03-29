package com.class9;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		/*
		 * Write a program that reads a range of integers (start and end point),
		 *  provided by a user and then from that range prints the sum of the even and odd integers.
		 */
		
		Scanner scan;
		int startNum;
		int endNum;
		int sumEven=0;
		int sumOdd=0;
		
		scan=new Scanner(System.in);
			System.out.println("enter start number");
			startNum=scan.nextInt();
			
			System.out.println("enter end number");
			endNum=scan.nextInt();
		if(startNum<endNum)	{
			
		}
		for (int a=startNum; a<=endNum; a++ ) {
			if(a%2==0) {
				sumEven+=a;
			}else {
				sumOdd+=a;
			}
		}
		System.out.println("The sum of even numbers is "+sumEven+" between "+startNum+" and "+endNum);
		System.out.println("The sum of odd numbers is "+sumOdd+" between "+startNum+" and "+endNum);	
			
		
			
			
				
		
		
	}

}
