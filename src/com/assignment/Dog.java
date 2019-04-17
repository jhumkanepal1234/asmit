package com.assignment;

public class Dog {
	
	static String dogBreed;
	  String dogName;
	  double dogWeight;
	  
	  public Dog(String Name, String Breed , double Weight){
	    dogBreed = Breed;
	    dogName = Name;
	    dogWeight = Weight;
	    System.out.println(dogName+" "+dogBreed+" "+dogWeight);
	     }
	  public  Dog(String Name, double Weight ){
	    dogName = Name;
	    dogWeight = Weight;
	    System.out.println(dogName+" "+dogBreed+" "+dogWeight);
	    }
	  
	  
	}


