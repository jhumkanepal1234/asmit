package com.class9;

public class NestedLoopsTask {

	public static void main(String[] args) {
		/*
		 * print
		 *   ******
		 *   *    *
		 *   *    *
		 *   ******
		 */
		
for (int i=1; i<=4; i++) {
            
            for (int y=1; y<=6; y++) {
            	if(i==1 ||i==4 ||y==1 ||y==6) {
            	System.out.print("*");
            }else {
            	System.out.print(" ");
            }
            }
            System.out.println();
        
	}
}
}



