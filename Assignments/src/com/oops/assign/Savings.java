package com.oops.assign;

public class Savings extends Account {

	public Savings(double balance) {
		super(balance);
	}

	@Override
	void withdraw(int amount) {
		System.out.println("king");
	}

	@Override
	void deposit(int amount) {
		System.out.println("kohli");
	}

}
