package com.class17_2;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * 
		 * Print the following pattern:
		 
		 *
		 **
		 ***
		 ****
		 *****
		 ****
		 ***
		 **
		 */
		Task4 bird= new Task4();
		bird.printPattern();
	}
	void printPattern() {

		for (int a = 1; a <= 6; a++) {
			for (int b = 1; b < a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int c=1; c<=5; c++) {
			for (int d=4; d>= c; d--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
