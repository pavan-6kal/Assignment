package com.training.basicz;

public class Book {
	String title ;
	String author;
	int price;
	String category;
	public Book(String title, String author, int price, String category) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.category = category;
	}
	void getDetails() {
		if(price > 500) {
			System.out.println("premium book");
		}
		else
			System.out.println("standered book");
	}

}
