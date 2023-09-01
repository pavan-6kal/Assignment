package com.training.basicz;

public class Secsmall {

	public static void main(String[] args) {
		int arr[] = { 9, 113, 8, 1 };

		int temp;
		for (int i = 0; i < 4; i++) {
			for (int j = i+1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}

			System.out.println(arr[i]);
		}
		System.out.println(arr[1]);

	}

}
