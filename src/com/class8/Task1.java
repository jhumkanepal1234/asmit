package com.class8;
/*
 * Print numbers from 1 to 100

Print numbers from 100 to 1

Print odd numbers from 1 to 20 (2 ways)

Print even numbers from 20 to 1 (2 ways)

Print even numbers between 20 and 50 (2 ways)

Print odd numbers between 20 and 50 (2 ways)
 */
public class Task1 {

	public static void main(String[] args) {
		//Print numbers from 1 to 100
		for(int a=1; a<=100; a++) {
            System.out.println(a);
}       
		// Print numbers from 100 to 1
		for(int a=100; a>=1; a--) {
			System.out.println(a);
		}
// Print odd numbers from 1 to 20 (2 ways)
		for( int x=1; x<=20; x++ ) {
			if(x % 2!=0) {
			System.out.println(x);
		}
//	Print even numbers from 20 to 1 (2 ways)	
			for( int z=20; z>=1; z-- ) {
				if(z % 2==0) {
				System.out.println(z);	
	}
//	 Print even numbers between 20 and 50 (2 ways)
		//1 way 		
		for(int w=20; w<=50; w++) {
			if(w%2==0) {
				System.out.println(w);
				}
		// 2nd way 
			for(int y=20; w<=50; y+=2) {
				System.out.println(y);
			}
// Print odd numbers between 20 and 50 (2 ways)
			//1 way 
			for(int a=20; a<=50; a++) {
				if (a%2==1) {
					System.out.println(a);
				}
			//2nd  way 
				for(int k=50; k>20; k--) {
					if(k%2==0) {
						System.out.println(k);
					}
				}
			}
			
			
		
				
	}

		}
	}
}
}
	
