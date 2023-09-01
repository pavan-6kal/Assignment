package com.training.basicz;

public class Smaller {

	public static void main(String[] args) {
		int arr[] = {2,1,33,23,2};
		int min= arr[0];
		for(int i : arr) {
			if(min>i) {
				min=i;
			}
		}
		System.out.println(min);

	}

}
