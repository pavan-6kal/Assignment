package com.oops.assign;

public class Employee {
	String name;
	String designation;
	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}
	double calcBonus(double basicAllowance) {
		double bonus = basicAllowance*2;
		return (bonus);}
	

	double calcBonus(double basicAllowance, double carAllowance) {
		double bonus1 = basicAllowance*carAllowance;
		return bonus1;
	}

	double calcBonus(double basicAllowance, double carAllowance, double houseAllowance) {
		double bonus2 = basicAllowance*carAllowance*houseAllowance;
		return bonus2;

	}
	

}
