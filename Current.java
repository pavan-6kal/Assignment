package com.assign.abstraction;

public class Current extends Account {

	public Current(double balance) {
		super(balance);
	}

	@Override
	void withdraw(int amount) {
		System.out.println("current withdrawwable "+amount);
	}

	@Override
	void deposit(int amount) {
		System.out.println("current deposit "+amount);
	}

}
