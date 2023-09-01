package com.training.basicz;

import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		//int temp=num;
		int sum=0;
		for(int i =1;i<=(num/2);i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(num==sum) {
			System.out.println(num+" is the perfect number");
		}
		else {
			System.out.println(num + " is not the perfect number");
		}
		

	}

}
