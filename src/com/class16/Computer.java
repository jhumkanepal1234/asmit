package com.class16;

public class Computer {
	
	String os, brand;
	int screen, ram;
	boolean mouse, keyboard;
	
	public static void main(String[] args) {
		
			
		
		// object 1
		
		Computer comp1= new Computer();
		comp1.mouse=true;
		comp1.keyboard=true;
		comp1.screen=2;
		comp1.ram=8;
		comp1.os="Window";
		comp1.brand="HP";
		
		comp1.watchMovie();
		comp1.doJAvaCoding();
		comp1.playMusic();
		
		System.out.println("-------------- For comp2 ------------" );
		
		//object 2
		
		Computer comp2=new Computer();
		comp2.mouse=false;
		comp2.keyboard=false;
		comp2.screen=4;
		comp2.ram=6;
		comp2.os="Mac OS";
		comp2.brand="Apple";
		
		comp2.watchMovie();
		comp2.doJAvaCoding();
		comp2.playMusic();
	}
		
		void watchMovie() {
			System.out.println("We can watch movie on a computer "+brand);
		}
		void doJAvaCoding() {
			System.out.println("We can do Java coding "+brand);
		}
		void playMusic() {
			System.out.println("We can play music "+brand);
		}
		
		
		
		
		
		
		
	
	}

