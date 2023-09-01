package com.training.basicz;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean flag=false;
		if(num<=1)
			System.out.println(num+" is not the prime number");
		else {
			for(int i =2;i<=(num/2);i++) {
				if (num%i==0) {
					flag=true;
				}
			}
		}
		if (flag==true) {
			System.out.println(num+" is not the prime number");
		}
		else
			System.out.println(num+" is a prime number");

	}

}
