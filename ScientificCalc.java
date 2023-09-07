package com.training.quest;

public class ScientificCalc extends BasicCal implements Scientific {


	@Override
	public void square(int x) {
		System.out.println("Square root "+(x*x));
	}

	@Override
	public void cube(int x) {
		System.out.println("Square root "+(x*x*x));
	}}