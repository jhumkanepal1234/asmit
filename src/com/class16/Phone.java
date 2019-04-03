package com.class16;

public class Phone {
	
	/*
	 * Create a Class “Phone”. Create 3 Objects of it: 
	 * iPhone, Android, Nokia with specific  attributes and behaviours.
	 */
	
	boolean screenTouch=true;
	String madeIn;
	int ram;
	
	
	public static void main(String[] args) {
		// object 1
		Phone iPhone=new Phone();
		iPhone.screenTouch=true;
		iPhone.madeIn="USA";
		iPhone.ram=3;
		
		iPhone.watchMovie();
		iPhone.videoCall();
		iPhone.playMusic();
		
		//object 2
		
		Phone Android=new Phone();
		Android.screenTouch=true;
		Android.madeIn="XXX";
		Android.ram=4;
		
		Android.watchMovie();
		Android.videoCall();
		Android.playMusic();
		
		// object 3
		
		Phone Nokia=new Phone();
		Nokia.screenTouch=false;
		Nokia.madeIn="zzz";
		Nokia.ram=4;
		
		Nokia.watchMovie();
		Nokia.videoCall();
		Nokia.playMusic();
	}
	
	void watchMovie() {
		System.out.println("We can watch movie on a ");
	}
	void videoCall() {
		System.out.println("We can videoCall ");
	}
	void playMusic() {
		System.out.println("We can play music ");
	}
		
		
		
		
		
		
		
		
		
		
	
	

}
