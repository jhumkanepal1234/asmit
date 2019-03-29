package com.class10;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a
		 * grade B (use 2 different ways of creating an array).
		 */

		char[] grade = { 'A', 'B', 'C', 'D', 'E', 'F' };

		System.out.println(grade[1]);
		
		//another way
		
		
		
		char[] g=new char[6];
        
        g[0]='A';
        g[1]='B';
        g[2]='C';
        g[3]='D';
        g[4]='E';
        g[5]='F';
        
        System.out.println(g[3]);
        
	}

}
