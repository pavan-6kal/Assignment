package com.assign.abstraction;

public class Savings extends Account {

	public Savings(double balance) {
		super(balance);
	}

	@Override
	void withdraw(int amount) {
		System.out.println("savings take "+amount);
	}

	@Override
	void deposit(int amount) {
		System.out.println("savings deposit "+amount);
	}

}
