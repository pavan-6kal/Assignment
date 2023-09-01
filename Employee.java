package com.training.basicz;

public class Employee {
	String name = "king";
	String design = "Mr.";
	void calBonus (double baiscAllowence) {
		System.out.println("employe allowence-"+(baiscAllowence));
	}
	void calBonus (double baiscAllowence,double carAllowence) {
		System.out.println("employe allowence3 -"+(baiscAllowence+carAllowence));
	}
	void calBonus (double baiscAllowence,double carAllowence, double houseAllowence) {
		System.out.println("employe allowence3-"+(baiscAllowence+carAllowence+houseAllowence));
	}

}
