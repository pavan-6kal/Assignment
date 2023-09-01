package com.oops.assign;

import java.util.*;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String studentname = sc.next();
		int id = sc.nextInt();
		int marks = sc.nextInt();
		Student student1 = new Student("good","kool");
		student1.printDetails();
		String k= student1.getGrades(87);
		System.out.println(k);

	}

}
