package com.class34;
import java.util.*;
public class TestTask3 {

	public static void main(String[] args) {
		
		Map<Integer, Task3> testMap=new HashMap<>();
		testMap.put(1, new Task3("Asmit", "Nepal", 27, 80000));
		
		
		Collection<Task3> values=testMap.values();
		for(Task3 obj:values) {
			obj.userDetails();
		}
		
		
	}

}
