package com.class17_2;

public class Pyramid {

	public static void main(String[] args) {
		
		
        /*I want to print pattern
         *       *
         *       **
         *       ***
         *       ****
         */
		
		Pyramid flag=new Pyramid();
		flag.printPatterns();
	}
	void printPatterns() {
		
for (int i=0; i<4; i++) {
            
            for (int y=0; y<=i; y++) {
                System.out.print("*");
            }
            System.out.println();
        }

	}

}
