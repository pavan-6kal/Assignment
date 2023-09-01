package com.training.basicz;

import java.util.*;

public class Registration {

	public static void main(String[] args) {
		String arr[] = { "a", "b", "c", "d" };
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		// for(int i=0;i<5;i++) {
		// System.out.println("enter name to register");
		// String name = sc.next();
		// }
		System.out.println("enter name to register");
		String user = sc.next();
		for (String i : arr) {
			System.out.println(i);
			if (user.equals(i)) {
				flag = false;
				break;

			}
		}
		if (flag == false) {
			System.out.println("name is not unique");
		} else {
			System.out.println("you are registered");

		}

	}

}
