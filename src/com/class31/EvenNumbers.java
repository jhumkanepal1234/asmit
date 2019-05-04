package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class EvenNumbers {

	public static void main(String[] args) {
	// Create an arrayList of even numbers from 1 to 50. Using Integer remove any number that is divisible by 5 from that arrayList.

		ArrayList<Integer> num=new ArrayList<>();
//		
		for(int i=1; i<=50; i++) {
			if(i%2==0)
			num.add(i);
		}
		
		System.out.println(num);
		
		Iterator<Integer> iterator=num.iterator();
		while(iterator.hasNext()) {
			int number=iterator.next();
			if(number%5==0) {
				iterator.remove();
			}
		}
		System.out.println(num);
			
	}

}
