package com.class4;

public class NestedIfAgain {
/*
 * declare variable for GPA and have a diploma
 * if user has a diploma_. congratulations __. if GPA is higher 3.5__> hire person, else do not hire
 */
	public static void main(String[] args) {
		
		double gpa=3.6;
		double expectedGpa=3.4;
		
		boolean hasDiploma=true;
		
		if (hasDiploma) {
			System.out.println("Congratulations");
			if (gpa>expectedGpa) {
				System.out.println("You are hired");
			}else {
				System.out.println("Unfortunately we cannot hire you");
			}
		}else {
			System.out.println("Please get your degree");
		}
		

	}

}
