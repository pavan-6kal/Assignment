package com.oops.assign;

import java.util.Scanner;

public class EMployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String designation = sc.next();
		
		Employee manager = new Employee(name,designation);
		System.out.println(manager.calcBonus(20));
		System.out.println(manager.calcBonus(2, 3));
		System.out.println(manager.calcBonus(2, 2, 2));
		
		Employee programmer = new Employee(name,designation);
		System.out.println(programmer.calcBonus(10));
		System.out.println(programmer.calcBonus(3, 3));
		System.out.println(programmer.calcBonus(3, 2, 2));
		
		Employee director = new Employee(name,designation);
		System.out.println(director.calcBonus(30));
		System.out.println(director.calcBonus(4, 3));
		System.out.println(director.calcBonus(4, 2, 2));
		
		
		
	}

}
