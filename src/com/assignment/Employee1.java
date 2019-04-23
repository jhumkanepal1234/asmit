package com.assignment;
public class Employee1{
String name;
String lastName;
int employeeId;
String startDate;
int salary;

public Employee1(String x, String y, int a, String z, int b){
  System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
}
public void Employee(String name, String lastName, int employeeId, String startDate, int salary){
  name=name;
  lastName=lastName;
  employeeId=employeeId;
  startDate=startDate;
  salary=salary;
  System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
}

}
