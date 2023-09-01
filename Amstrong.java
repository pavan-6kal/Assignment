package com.training.basicz;

public class Amstrong {

	public static void main(String[] args) {
		int n = 153;
		int temp = n;
		int sum = 0;
		int i = 0;
		while (n != 0) {

			int r = n % 10;
			System.out.println(r);
			sum = (r*r*r)+sum;
			n = n / 10;
			
		}
		
		System.out.println(sum);
		if (sum == temp) {
			System.out.println("amstrong number");
		}

	}

}
