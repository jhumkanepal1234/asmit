package com.class19;

public class Application1 {
	
	public static void main(String[] args) {
		
		Animal dog1= new Animal();
		
		System.out.println(dog1.breed);
		System.out.println(dog1.weight);
		System.out.println(dog1.age);
		System.out.println(dog1.name);
		            
		 
		Animal dog2= new Animal();
												// dog1.name="Jack"; We can change the name when we use static in another main class Animal
		System.out.println(dog2.breed);
		System.out.println(dog2.weight);
		System.out.println(dog2.age);
		System.out.println(dog2.name);
		
		Animal dog3= new Animal();
	
		System.out.println(dog3.breed);
		System.out.println(dog3.weight);
		System.out.println(dog3.age);
		System.out.println(dog3.name);
	}

}
