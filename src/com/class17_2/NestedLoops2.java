 package com.class17_2;

public class NestedLoops2 {

	public static void main(String[] args) {
		/*
		 *  12345
		 *  12345
		 *  12345
		 *  12345
		 */
		
		NestedLoops2 demo= new NestedLoops2();
		demo.printNumber();
	}
	
	void printNumber() {
		
		for (int i=1; i<5; i++) {
			
			for(int y=1; y<6; y++) {
				
				System.out.print(y);  //12345
			}
			System.out.println();	
		}
	}

}
