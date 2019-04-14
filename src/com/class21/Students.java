package com.class21;

public class Students {
	/*
	 * Create a Class called Students
	Create three  variables  studentName , studentID  and  numberOfStudents
	Create three objects of the Students Class
	Set the value for  studentName , studentID and increment  the numberOfStudents for each object
	Print out  total number of students
	 */
	public String studentName;
	int studentId;
	public static int numberOfStudents;
	
	public static void main (String[] args) {
		
		Students obj1=new Students();
		Students obj2=new Students();
		Students obj3=new Students();
		
		obj1.studentName="Asmit";
		obj1.studentId=11;
		numberOfStudents++;
		
		
		obj2.studentName="Ali";
		obj2.studentId=22;
		numberOfStudents++;
		
		obj3.studentName="Tayab";
		obj3.studentId=33;
		numberOfStudents++;
		
	
		
	System.out.println("Total number of students is "+numberOfStudents);	
		
		
}
}