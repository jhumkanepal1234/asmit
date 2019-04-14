package com.class21;

public class Employee {
	
	static String CEO="Sumair";
	 int eID;
	int salary;
	

	public static void main(String[] args) {
		/*
		 *  Create a Class called Employee:
			Create three  variables  eID , salary and set the CEO to “Sumair”
			Create two objects of the class Employee
			Set the value of eID, salary for each of the objects
			Print out the eID , salary and  CEO for each of the objects
		 */
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		
		e1.eID=12;
		e1.salary=1000;
		e1.getInfo();
		
		e2.eID=34;
		e2.salary=2000;
		e2.getInfo();
	}


	
	public void getInfo() {
		System.out.println("The CEO is "+CEO+" and the eID is "+eID+" and the salary of him is "+salary);
	}
		
		

	

}
