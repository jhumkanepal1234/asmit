package com.class5;
import java.util.Scanner;
public class Grade {
	/*
	 * Write a program that will read three inputs of scores (quiz, mid term, and final scores) 
	 * and determine the grade based on the following rules:
if the average score >=90 =>grade=A
if the average score >= 70 and <90 => grade=B
if the average score>=50 and <70 =>grade=C
if the average score<50 =>grade=F
	 */

	public static void main(String[] args) {
		Scanner scan;
		int quiz;
		int midTerm;
		int finalScore;
		
		
		
		 scan=new Scanner(System.in);
		 	System.out.println("Input quiz score");
		    quiz=scan.nextInt();
		 
		 System.out.println("Input mid term score");
		 	midTerm=scan.nextInt();
		 	
		 System.out.println("Input final score");
		 	finalScore=scan.nextInt();
		 	
		 	int grade=(quiz+midTerm+finalScore)/3;
		 	
		 	
		 if(grade>=90) {
		 		System.out.println("grade A");
		 	}else if(grade>= 70 && grade<90) {
		 		System.out.println("grade B");
		 	}else if(grade>= 50 && grade<70) { 
		 		System.out.println("grade c");
		 	}else {
		 		System.out.println("grade F");
		 	}
	
	

	}

}
