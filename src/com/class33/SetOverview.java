package com.class33;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class SetOverview {

	public static void main(String[] args) {
		
		Set <String> classDays=new LinkedHashSet<>();
		classDays.add("Tuesday");
		classDays.add("Wednesday");
		classDays.add("Thursday");
		classDays.add("Saturday");
		classDays.add("Sunday");
		
		System.out.println(classDays);
		
		for(String days: classDays) {
			System.out.println(days);
		}
		System.out.println("------------------------");
		Iterator<String> it=classDays.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
