package com.class13;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Write a program that reads two people’s first names and if they expecting boy or girl? Based on the input suggests a name for a baby:
			Example Output:
			Mom’s first name? Mary
			Dad’s first name? Daniel
			Boy or Girl? boy
			Suggested baby name: DANRY

	Example Output:
	Mom’s first name? Mary
	Dad’s first name? Daniel
	Boy or Girl? girl
	Suggested baby name: MAIEL
		 */

		/*Scanner scan;
		String name1="Mary";
		String name2="Daniel";
		String name3="Gender";
		
		scan=new Scanner(System.in);
		System.out.println("Please enter Mom’s first name");
		name1=scan.nextLine();
		
		System.out.println("Please enter Dad's first name");
		name2=scan.nextLine();
		
		System.out.println("Please enter gender");
		name3=scan.nextLine();
		
		switch (name3) {
		case "boy":
			name3=name2.substring(0,3)+name1.substring(name1.length()-2,name1.length());
			System.out.println("Suggested baby name: "+name3.toUpperCase());
		break;	
		case "girl":
			name3=name1.substring(0,2)+name2.substring(name2.length()-3,name2.length());
			System.out.println("Suggested baby name: "+name3.toUpperCase());
		break;
		default:
			System.out.println("Undefined gender");
			
			}  */    // this is what I did 
		
		
		
		Scanner scan;       // instructor way with if else. Easy way using if else
		String motherName,fatherName, gender, babyName;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter mothers name");
		motherName=scan.nextLine();
		
		System.out.println("Please enter fathers name");
		fatherName=scan.nextLine();
		
		System.out.println("Please enter expected gender");
		gender=scan.nextLine();
		
		
		if(gender.equalsIgnoreCase("boy")) {
			babyName=fatherName.substring(0, fatherName.length()/2)+
					motherName.substring(motherName.length()/2);
		}else if(gender.equalsIgnoreCase("girl")){
		babyName=motherName.substring(0, motherName.length()/2)+
				fatherName.substring(fatherName.length()/2);
		}else {
			babyName="No suggestion";
			
		}
		System.out.println(babyName.toUpperCase());
		
	
	}
			
		
		
	}


