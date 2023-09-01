package com.oops.assign;

import java.util.Scanner;

public class EmployeeMain1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String designation = sc.next();
		Employee employee = new Employee(name, designation);
		if (designation.equals("programmer")) {
		System.out.println(employee.calcBonus(21));
			}
		else if(designation.equals("manager")) {
			System.out.println( employee.calcBonus(2, 4));
		}
		else if(designation.equals("director")) {
			System.out.println(employee.calcBonus(3, 3, 3));
		}
	}

}
