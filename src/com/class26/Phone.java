package com.class26;

public class Phone {
	
	public void  makeCall() {
		System.out.println("can make a phone call");
	}
	public void hasCammera() {
		System.out.println("Phone as a cammera");
	}

}

class iPhone extends Phone{
	public void  makeCall() {
		System.out.println("can make a face time");
	}
	public void  hasCammera() {
		System.out.println("iPhone has dual HD cammera");
	}
	
}

class Nokia extends Phone{
	public void cannotBreak() {
		System.out.println("Nokia phones are unbreakable");
	}
	
}

class Samsung extends Phone{
	public void  hasCammera() {
		System.out.println("Samsung phone has 3 lenses cammera");
	}
	
}