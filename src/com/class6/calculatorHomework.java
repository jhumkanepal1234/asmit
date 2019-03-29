/*
 * HomeWork: Using scanner class create calculator. 
 * Allow user to enter 2 numbers and operator(+,-,*,/).
 *  Based on operator provide the result to user.
 */

package com.class6;
import java.util.Scanner;
public class calculatorHomework {

	public static void main(String[] args) {
		Scanner scan;
		int num1, num2;
		int result;
		char operators;
		 
		
		scan=new Scanner(System.in);
		System.out.println("Please enter the first number");
		num1=scan.nextInt();
		
		System.out.println("Please enter the second number");
		num2=scan.nextInt();
		
		System.out.println("Please enter operator");
		operators=scan.next().charAt(0);
		
		switch(operators) {
		
		case '+':
			result=num1 + num2;
		break;
		case '-':
			result=num1 - num2;
		break;
		case '*':
			result=num1 * num2;
		break;
		case '/':
			result=num1 / num2;
		break;
		default:
			result=0;
			System.out.println("Invalid result");
			}
		
		System.out.println("The result of two numbers is "+result);

	}

}
