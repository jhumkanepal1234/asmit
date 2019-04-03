package com.class13;

public class groupWork {

	public static void main(String[] args) {
		/*
		 * 1. Write a program to swap 2 numbers without a temporary variable? Swap  2 strings without a temporary variable?
		 
		 * 2.Write a java program to find the second largest number in the array? Maximum and minimum number in the array?

		 3. Find out how many alpha characters present in a string?

		 4.How to find out the part of the string from a string? What is substring? Find number of words in string?

		 5. Write a java program to reverse String? Reverse a string word by word?      */
		
		// number 1   First Part
		int x=20;   
        int y=8;
        System.out.println("Before swapping x = " +x+" And y = "+y);
         x = x + y; // 20+8=28
         y = x - y; // 28-8=20
         x = x - y; // 28-20=8
         System.out.println("After swapping x = " +x+" And y = "+y);
         
         System.out.println("---------Second part-----------");
         
        // number 1  Second part
         String a = "Hello"; 
         String b = "Java";
         System.out.println("Strings before swap: a = " +  a + " and b = " + b);
         a = a + b;    // 2nd string to 1st string
         
         b = a.substring(0,a.length()-b.length());    //storing a in b
         
         a = a.substring(b.length());     //storing b in a
         
         System.out.println("Strings after swap: a = " +  a + " and b = " + b);
         
         // number two
         System.out.println("---------- number 2 answers--------------");
         
         int largest = 0;
         int secLarge = 0;
         int smallest = 0;
         int[] array = { 65, 56, 48, 55, 12, 0, 100, 1789, 35 };
         for (int i = 0; i < array.length; i++) {
             if (largest < array[i]) {
                 secLarge = largest;
                 largest = array[i];
             }

         }
         for (int i = 0; i < array.length; i++) {
             if (smallest > array[i]) {
                 smallest = array[i];
             }
         }
         System.out.println(secLarge);
         System.out.println(largest);
         System.out.println(smallest);
         
         System.out.println("--------Number 3 answers-------");
        		 
         String str="Syntax! students batch4 are 100% tester";
			String newstr= str.replaceAll("[^A-Za-z]", "");
	        System.out.println(newstr.length());
	        
	        System.out.println("--------Number 4 answers-------"); 
	        
	        String str2="Saturday is a coding day";
			
			String[] array2=str2.split(" ");
	        System.out.println("The length of the array is "+array2.length);
	        for(String substring: array2) {
	            System.out.println(substring);
		}
	     
	        
	        
	        System.out.println("--------Number 5 answers-------"); 
	        
	        String s1 = "Welcome to java";
	        String reverse="";
	        
	        char[] array1=s1.toCharArray();
	        for (int w=array1.length-1; w>=0; w--) {
	            reverse=reverse+array1[w];
	        }
	        System.out.println("Reversed String is: "+reverse);
	        
	  
	               }
	    	}
	

	        
	        
	        
        	 
         
         
         
         
         
         
         
         
         
         
         
         
         
	                    
	               
				
						

	


