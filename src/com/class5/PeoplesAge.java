/*
 * Prompt the user to enter two people's heights in inches. Each person should be classified as one of the following:
• short (under 5 feet)
• medium(5 to 6 feet)
• tall (6 feet and over)
 */


package com.class5;
import java.util.Scanner;

public class PeoplesAge {

	public static void main(String[] args) {
		
		Scanner scan;
		double height;
		
		
		scan = new Scanner(System.in);
		System.out.println("Enter person height in inches");
		height=scan.nextDouble();
		
		if(height<5) {
			System.out.println("Short");
		}else if(height>=5 && height<=6) {
			System.out.println("Medium");
		}else {
			System.out.println("Tall");
		}
		
	}
	}


