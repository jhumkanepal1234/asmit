package com.class16;

public class Phone {
	
	/*
	 * Create a Class “Phone”. Create 3 Objects of it: 
	 * iPhone, Android, Nokia with specific  attributes and behaviours.
	 */
	
	boolean screenTouch=true;
	String madeIn, model;
	int ram;
	
	
	public static void main(String[] args) {
		System.out.println("-------------------- For object iPhone-------------");
		// object 1
		Phone ph1=new Phone();
		ph1.model="iPhone";
		ph1.screenTouch=true;
		ph1.madeIn="USA";
		ph1.ram=3;
		
		ph1.watchMovie();
		ph1.videoCall();
		ph1.playMusic();
		System.out.println("-------------------- For object Android-------------");
		//object 2
		
		Phone ph2=new Phone();
		ph2.model="Android";
		ph2.screenTouch=true;
		ph2.madeIn="XXX";
		ph2.ram=4;
		
		ph2.watchMovie();
		ph2.videoCall();
		ph2.playMusic();
		System.out.println("-------------------- For object Nokia-------------");
		// object 3
		
		Phone ph3=new Phone();
		ph3.model="Nokia";
		ph3.screenTouch=false;
		ph3.madeIn="zzz";
		ph3.ram=4;
		
		ph3.watchMovie();
		ph3.videoCall();
		ph3.playMusic();
	}
	
	void watchMovie() {
		System.out.println("We can watch movie on a "+model);
	}
	void videoCall() {
		System.out.println("We can videoCall on "+model);
	}
	void playMusic() {
		System.out.println("We can play music on "+model);
	}
		
		
		
		
		
		
		
		
		
		
	
	

}
