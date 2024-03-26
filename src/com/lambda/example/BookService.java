package com.lambda.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

	List<Book> getBookInsert() {
		List<Book> bks = new BookDAO().getBooks();
//		Collections.sort(bks, new Comparator<T>() {
//
//			@Override
//			public int compare(T o1, T o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//		});
		return bks;

	}
 
}

//class MyComperator implements Comparator<Book> {
//
//	@Override
//	public int compare(Book o1, Book o2) {
//		return o1.getName().compareTo(o2.getName());
//	}
//
//}
