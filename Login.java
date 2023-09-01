package com.training.basicz;
import java.util.*;

public class Login {

	public static void main(String[] args) {
		String arr[]= {"a","b","c","d"};
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter username to login ");
		String user = sc.next();
		for (String i : arr) {
			System.out.println(i);
			if (i.equals(user)) {
				flag = false;
				break;

			}
		}
		if (flag == false) {
			System.out.println("invalid username");
		} else {
			System.out.println("you are logged in ");

		}

	}

}
