package com.class27;

public abstract class Phone {
	
	public void makeCall() {
		System.out.println("Phone can make call");
	}
	
	public void sendText() {
		System.out.println("Phone can make send text");
	}
	
	public abstract void unlockPhone();
	public abstract void viewPictures();
		
}

class iPhone extends Phone{  // concrete class - is class that is inherited from a abstract class
							// or implemented by interface and providing implementation of all unimplemented/ abstract classes
	@Override
	public void unlockPhone() {
		System.out.println("To unlock Iphone we can use FaceId or FingerPrint");
		
	}

	@Override
	public void viewPictures() {
		System.out.println("To view Pictures on Iphone can go to Image");
		
	}
}

class Samsung extends Phone{

	@Override
	public void unlockPhone() {
		System.out.println("To unlock samsung we need to enter password");
		
	}

	@Override
	public void viewPictures() {
		System.out.println("To view pictures on samsung can go to pictures");
		
	}
}














