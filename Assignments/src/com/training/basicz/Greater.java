package com.training.basicz;

import java.util.*;

public class Greater {

	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in); int a[] = new int[5]; for (int i = 0; i
		 * < a.length; i++) { System.out.println("e:"); int e = sc.nextInt(); }
		 */
		int arr[] = { 0, 1, 20, 4, 5 };
		int max = arr[0];
		for (int j : arr) {
			if (max > j) {
				max = j;
			}

		}
		System.out.println(max);

	}

}
