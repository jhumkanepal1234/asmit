package com.class6;

import java.util.Scanner;

/*
 * Ask user to enter their country and capture it.
 *  Once values are captured print which language user speaks.
 */
public class Language {

	public static void main(String[] args) {
		
		Scanner scan;
		String country;
		String language;
		
		scan=new Scanner(System.in);
			System.out.println("Please enter country name ");
		country=scan.nextLine();
		
		switch (country) {
		
		case "USA":
			language="English";
			break;
			
		case "Nepal":
			language="Nepali";
			break;
		
		case "India":
			language="Indian";
			break;
			
		case "Russia":
			language="Russian";
			break;
			
		case "Bangladesh":
			language="Bangeli";
			break;
			
		case "Greece":
			language="Greek";
			break;
			
		case "Mexico":
			language="Spanish";
			break;
		
		default:
            language="Invalid";
		}
		System.out.println("The language spoken by "+country+" is "+language);
		
	}

}
