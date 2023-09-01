package com.training.basicz;

public class OverloadMain {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.calBonus(23);
		employee.calBonus(23, 29);
		employee.calBonus(12, 12, 12);
	}

}
