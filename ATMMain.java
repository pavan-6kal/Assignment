package com.oops.assign;

import java.util.*;

public class ATMMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1- savings, 2- curretnt");
		int key = sc.nextInt();

		switch (key) {
		case 1:
			Account saving = new Savings(5000);
			saving.withdraw(1000);
			saving.withdraw(500);
		case 2:
			Account current = new Current(6000);
                        current.withdraw(600);
			current.deposit(2000);
		}

	}

}
