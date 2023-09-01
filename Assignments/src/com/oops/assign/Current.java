package com.oops.assign;

public class Current extends Account {

	public Current(double balance) {
		super(balance);
	}

	@Override
	void withdraw(int amount) {
		System.out.println("lolly");
	}

	@Override
	void deposit(int amount) {
		System.out.println("pop");
	}

}
