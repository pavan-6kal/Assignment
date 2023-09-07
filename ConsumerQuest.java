package com.training.quest;

import java.util.function.Consumer;

public class ConsumerQuest {
	public static void main(String[] args) {
		Consumer<Integer> con = (x) -> {
			int y=6;
			System.out.println("Multiplication:"+(x*y));
		};
		con.accept(6);
	}
}


