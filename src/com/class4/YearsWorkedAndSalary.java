package com.class4;
/*Write a program to ask user to enter numbers of worked years and annual salary. 
 * If user worked for more or equals to 5 years than user is eligible for the bonus, otherwise he is not. 
 * Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
 */

import java.util.Scanner;
public class YearsWorkedAndSalary {

	public static void main(String[] args) {
		
		int years;
		int salary;
		int avgyears=5;
		int avgsalary=50000;
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter year");
		years=input.nextInt();
		
		//Scanner input2=new Scanner(System.in);
		System.out.println("Please enter salary");
		salary=input.nextInt();
		
		if(years>=avgyears) {
			System.out.println("User will be eligible for bonus");
			if (salary>=avgsalary) {
				System.out.println("User will get 5000 bonus");
			}else {
				System.out.println("User will get 3000 bonus");
			}
		}else {
			System.out.println("User will not be eligible for bonus");
		}
		

	}

}

