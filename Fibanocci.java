package com.training.basicz;

public class Fibanocci {

	public static void main(String[] args) {
		int num = 10;
		int a = 0;
		int b = 1;
		if (num > 1) {
			int temp;
			System.out.println(a);
			System.out.println(b);
			for (int i = 2; i < num; i++) {
				temp = a + b;
				System.out.println(temp);
				a=b;
				b=temp;

			}

		}

	}

}
