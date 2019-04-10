package com.class20;

public class Student {

	public static void main(String[] args) {
		/*
		 * Create class Student that will have a method getGrade your method should
		 * accept the score of a student and return grade score >90 -A score >80 -B
		 * score >70 -C score >50 -D anything else -F
		 */
		Student obj = new Student();
		int grade = obj.getGrade(91);
		System.out.println("My grade at Syntax is " + grade);
	}

	int getGrade(int grade) {

		if (grade >= 90) {
			System.out.println("A");
		} else if (grade >= 80) {
			System.out.println("B");
		} else if (grade >= 70) {
			System.out.println("C");
		} else if (grade >= 50) {
			System.out.println("D");

		} else {
			System.out.println("F");
		}
		return grade;

	}
}
