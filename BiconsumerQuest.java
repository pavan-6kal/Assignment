package com.training.quest;

import java.util.function.BiConsumer;

public class BiconsumerQuest {

	public static void main(String[] args) {
			BiConsumer<String, Integer> con = (name,age) -> {
				if(name.equals("Admin")  && age> 30)
					System.out.println("True"); 
				else
					System.out.println("False");
				
			};
			con.accept("Admin", 46);
	}

}