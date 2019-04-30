package com.DeepakClass;

public class ReverseString {

	public static void main(String[] args) {
		String name="Asmit";
		String rev="";
		
		for(int i=name.length()-1; i>=0; i--) {
			rev=rev+name.charAt(i);
		}
System.out.println("Reverse of "+name+" is "+rev);
	}

}
