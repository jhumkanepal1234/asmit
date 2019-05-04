package com.class32;

public abstract class Insurance {
	/*
	 * Create a class Insurance that will have an attribute as insuranceName and
	 * unimplemented behaviour as getQuote and cancelInsurance. Create 3 subclasses
	 * Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet
	 * has petType attribute. Create 3 objects of the sub classes and store them in
	 * ArrayList. Using 1 reference variable access methods from different classes.
	 */
	public String insuranceName;

	public Insurance(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public abstract void getQuote();

	public abstract void cancelInsurance();

}

class Car extends Insurance {

	public Car(String insuranceName) {
		super(insuranceName);
	}

	@Override
	public void getQuote() {
		System.out.println("Provide quote for car");
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Cancel insurance for Car");
	}
}

class Pet extends Insurance {

	public Pet(String insuranceName) {
		super(insuranceName);
	}

	@Override
	public void getQuote() {
		System.out.println("Provide quote for Pet");
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Cancel insurance for pet");
	}

}

class Health extends Insurance {

	public Health(String insuranceName) {
		super(insuranceName);
	}

	@Override
	public void getQuote() {
		System.out.println("Provide quote for Health");

	}

	@Override
	public void cancelInsurance() {
		System.out.println("Cancel insurance for Health");

	}

}
