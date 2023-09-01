package com.oops.assign;

public class Student {
	String name;
	String department;

	public Student(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}

	void printDetails() {
		System.out.println("good look");

	}

	String getGrades(int grade) {
		String s;
		if (grade > 90 && grade <= 100) {
			s = "A";
			return s;
		} else if (grade > 80 && grade <= 90) {
			s = "B";
			return s;
		} else if (grade > 70 && grade <= 80) {
			s = "C";
			return s;
		} else if (grade > 60 && grade <= 70) {
			s = "D";
			return s;
		} else if (grade > 50 && grade <= 60) {
			s = "E";
			return s;
		} else {
			s = "Fail";
			return s;
		}

	}

}
