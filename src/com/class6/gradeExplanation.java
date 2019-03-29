/*
 * Allow user to enter grade and then provide explanation:
 *  A-Excellent, B-Good, C-Average,D-Bad, any other grade --> Not Acceptable.
 *  At the end your program should print which grade was entered by a user with explanation.
 */

package com.class6;
import java.util.Scanner;
public class gradeExplanation {

	public static void main(String[] args) {
		Scanner scan;
		char grade;
		String info;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter the grade of the student");
		grade=scan.next().charAt(0);
		
		switch(grade) {
		
		case 'A':
			info="Excellent";
		break;
		case 'B':
			info="Good";
		break;
		case 'c':
			info="Aveerage";
		break;	
		
	    case 'D':
	    	info="Bad";
	    break;
	    
		default:
			info="Not Acceptable";
		}
		System.out.println("The grade of the student "+info);
		

	}

}
