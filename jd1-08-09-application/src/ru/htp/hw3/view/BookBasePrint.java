package ru.htp.hw3.view;

import java.util.List;

import ru.htp.hw3.entity.Book;

public class BookBasePrint {
	
	public void printList (List <Book> list) {
		for (Book b:list) {
			System.out.println(b);
		}
	}

}
