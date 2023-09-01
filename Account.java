package com.oops.assign;

public class Account {
	double balance;
	
	public Account(double balance) {
		super();
		this.balance = balance;
	}

	void withdraw(int amount) {
		System.out.println(amount);
	}
	void deposit(int amount) {
		System.out.println(amount);
	}
	double getBalance() {
		return balance;
	}
}
