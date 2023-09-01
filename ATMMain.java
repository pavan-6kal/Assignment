package com.assign.abstraction;

import java.util.*;

public class ATMMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1- savings, 2- curretnt");
		int key = sc.nextInt();

		switch (key) {
		case 1:
			Account saving = new Savings(5000);
			break;
		case 2:
			Account current = new Current(6000);

		}

	}

}
