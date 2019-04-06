package com.class17_2;

public class NestedLoops4 {

	public static void main(String[] args) {
		

		/*I want to print pattern
         *  *****
         *  *****
         *  *****
         *  *****
         
         */
		
		NestedLoops4  car= new NestedLoops4();
		car.printPattern();
	}
	void printPattern() {
        
        for (int i=0; i<4; i++) {
            
            for (int y=0; y<5; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
	


