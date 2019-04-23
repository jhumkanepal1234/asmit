package com.class26;

public class PhoneTest {

	public static void main(String[] args) {
		System.out.println("----Object of Phone----");
		Phone phone=new Phone();
		phone.hasCammera();
		phone.makeCall();
		
		System.out.println("---Object of iPhone-----");
		iPhone iphone=new iPhone();
		iphone.hasCammera();
		iphone.makeCall();
		
		System.out.println("-----Object of Samsung------- ");
		Samsung samsung=new Samsung();
		samsung.makeCall();
		samsung.hasCammera();

		
		System.out.println("-----Object of Nokia------- ");
		Nokia nokia=new Nokia();
		nokia.makeCall();
		nokia.hasCammera();
		
		System.out.println("-----Object of iPhone referring to parent------- ");
		Phone p=new iPhone();
		p.makeCall();
		p.hasCammera();
		
		Phone p1=new Nokia();
		p1.makeCall();
		p1.hasCammera();
	//	p1.cannotBreak();   Parent doesn't have  child features/ method undefined
		
		// Creating a variable of a ParentType
		Phone parentPhone;
		
		// assigning iPhone Object
		parentPhone=new iPhone();
		parentPhone.makeCall();
		parentPhone.hasCammera();
		
		// assigning Samsung Object
		parentPhone=new Samsung();
		parentPhone.makeCall();
		parentPhone.hasCammera();

		// assigning Nokia Object
		parentPhone=new Nokia();
		parentPhone.makeCall();
		parentPhone.hasCammera();
		
			
		
		}	
	}


