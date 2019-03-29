package com.class9;

public class NestedLoops5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*I want to print pattern
         *  54321
         *  54321
         *  54321
         *  54321
         
         */
        
        for (int i=4; i>=1; i--) {
            
            for (int y=5; y>0; y--) {
                System.out.print(y);
            }
            System.out.println();
        }

        
        

	}

}
