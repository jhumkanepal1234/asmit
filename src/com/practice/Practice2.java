package com.practice;

import com.class17.Task3;

public class Practice2 {
	//// Create a method that will print whether given String is palindrome or not.
	// 
	//Method in Java
	//Methods with Parameters and without 
	//Methods with return values and without

	public static void main(String[] args) {
		
		Practice2 str=new Practice2();
		str.palindrome("Dad");
		str.palindrome("Mom");
		str.palindrome("Son");
		str.palindrome("Daughter");
		str.palindrome("Madam");
		str.palindrome("Father");
		
	}
		
		
		void palindrome(String str) {
			String rev="";
			
			for(int i=str.length()-1; i>=0; i--) {
				rev+=str.charAt(i);
			}
			if(rev.equalsIgnoreCase(str)) {
				System.out.println("The word "+str+" is palindrome");
			}else {
				System.out.println("The word "+str+" is not palindrome");
			}
		}
		
		
	
	

}
