package com.lambda.example;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

	public List<Book> getBooks() {
		List<Book> books = new ArrayList<>();
		books.add(new Book(12, "Core Java", 344));
		books.add(new Book(12, "Advance Java", 344));
		books.add(new Book(12, "Spring Java", 344));
		books.add(new Book(12, "Spribg Boot Java", 344));
		books.add(new Book(12, "basic Java", 344));

		return books;

	}
}
