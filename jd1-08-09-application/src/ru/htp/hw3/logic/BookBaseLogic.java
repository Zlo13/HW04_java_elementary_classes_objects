package ru.htp.hw3.logic;

import java.util.ArrayList;
import java.util.List;

import ru.htp.hw3.entity.Book;

/*
9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
*/

public class BookBaseLogic {

	public List<Book> autorBook(List<Book> list, String autor) {

		List<Book> autorList = new ArrayList<>();

		for (Book book : list) {
			if (book.getAutor().equalsIgnoreCase(autor)) {
				autorList.add(book);
			}
		}
		return autorList;
	}

	public List<Book> publisherBook(List<Book> list, String publisher) {

		List<Book> publisherList = new ArrayList<>();

		for (Book book : list) {
			if (book.getPublisher().equalsIgnoreCase(publisher)) {
				publisherList.add(book);
			}
		}
		return publisherList;
	}

	public List<Book> booksReleasedAfterGivenYear(List<Book> list, int yearPublication) {

		List<Book> afterYearPublication = new ArrayList<>();

		for (Book book : list) {
			if (book.getYearPublication() > yearPublication) {
				afterYearPublication.add(book);
			}
		}

		return afterYearPublication;

	}

}
