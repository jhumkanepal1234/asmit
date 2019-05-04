package com.class33;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class Task1 {
	public static void main(String[] args) {
		
	
	/* How can you remove all duplicates from ArrayList?

			List<String> aList=new ArrayList<String>();
			        aList.add(“John”);
			        aList.add(“Jane”);
			        aList.add(“James”);
			        aList.add(“Jasmine”);
			        aList.add(“Jane”);
			        aList.add(“James”); */
	
	List<String> aList=new ArrayList<String>();
    
	aList.add("John");
	aList.add("Jane");
    aList.add("James");
    aList.add("Jasmine");
    aList.add("Jane");
    aList.add("James");
    
   HashSet<String> obj=new HashSet<>(aList);
   System.out.println(obj);
   
    
    
	
	
    
}
}
