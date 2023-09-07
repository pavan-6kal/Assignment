package com.training.quest;

import java.util.function.Supplier;

public class SupplierQuest {

	public static void main(String[] args) {
		Supplier<String> sup = () -> {
			String str = "king";
			String val = str.toUpperCase();
			System.out.println(val);
			return val;

		};
		sup.get();
	}

}
