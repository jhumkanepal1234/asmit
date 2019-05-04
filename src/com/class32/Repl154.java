package com.class32;

import java.util.HashSet;
import java.util.Iterator;
class Repl154 {
	public static void main(String[] args){
	    
	    HashSet<String> hset = new HashSet<>();
			hset.add("first");
			hset.add("second");
			hset.add("third");
			hset.add("fourth");
			hset.add("fifth");
			
			Iterator<String> iterator=hset.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
				
	  }
				
	  }
	}