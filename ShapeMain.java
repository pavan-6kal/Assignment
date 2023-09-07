package com.training.quest;

public class ShapeMain {
	public static void main(String[] args) {
		Shape shape = (x, y) -> {
			System.out.println("Area of Rectangle:" + (x * y));
		};
		shape.area(4, 6);

		shape = (x, y) -> {
			System.out.println("Area of Triangle:" + (0.5 * x * y));
		};
		shape.area(6, 6);

		shape = (x, y) -> {
			System.out.println("Area of squar:" + (x * x));
		};
		shape.area(6, 6);

	}

}
