package com.training.basicz;

public class SumAvg {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int sum=0;
		for (int i:arr) {
			sum+=i;
			
		}
		System.out.println(sum);
		System.out.println(arr.length);
		System.out.println(sum/(arr.length));

	}

}
