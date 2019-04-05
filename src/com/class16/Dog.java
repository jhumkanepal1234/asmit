package com.class16;

public class Dog {
	
	/*
	 * Create a Dog Class and create 3 different objects of it: 
	 * Husky, Bulldog, Labrador  with specific  attributes and behaviours.
	 */
		String breed, color;
	    int year;
	    boolean angryDog;
	    
	    

	    public static void main(String[] args) {
	    	
	    	System.out.println("---------- for Huskey --------");
	    	
	Dog dog1=new Dog();       
	dog1.breed="Hasky";
	dog1.angryDog=false;
	dog1.color="Grey";
	dog1.year=3;
	
	dog1.bark();
	dog1.sit();
	
	System.out.println("---------- for Bulldog --------");
	
	Dog dog2=new Dog();
	dog2.breed="Bulldog";
	dog2.angryDog=true;
	dog2.color="Black";
	dog2.year=5;
	
	dog2.bark();
	dog2.sit();
	
	System.out.println("---------- for Labrador --------");   
	
	Dog dog3=new Dog();
	dog3.breed="Labrador";
	dog3.angryDog=false;
	dog3.color="White";
	dog3.year=7;
	
	dog3.bark();
	dog3.sit();
	        
	    }

	    void bark() {
	        System.out.println("Wow! "+breed+" can sit");
	    }
	    void sit() {
	        System.out.println(breed+" hunt");
	    }
	    
	    }
	