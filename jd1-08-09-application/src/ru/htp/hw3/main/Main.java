package ru.htp.hw3.main;

import java.util.ArrayList;

import ru.htp.hw3.entity.BookBase;
import ru.htp.hw3.logic.BookBaseLogic;
import ru.htp.hw3.view.BookBasePrint;

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

public class Main {

	public static void main(String[] args) {
		BookBase base = new BookBase(new ArrayList<>());

		base.addBook("Стрелок", "Стивен Кинг", "Звезда", 1982, 450, 1200);
		base.addBook("Извлечение троих", "Стивен Кинг", "Молния", 1987, 720, 1700);
		base.addBook("Тор", "Василий Сахаров", "Молния", 2000, 750, 450);
		base.addBook("Диверсант", "Василий Сахаров", "Молния", 2012, 625, 520);

		BookBaseLogic bookBaseLogic = new BookBaseLogic();
		BookBasePrint print = new BookBasePrint();

		print.printList(bookBaseLogic.autorBook(base.getBase(), "стивен Кинг"));

		System.out.println();

		print.printList(bookBaseLogic.publisherBook(base.getBase(), "молния"));

		System.out.println();

		print.printList(bookBaseLogic.booksReleasedAfterGivenYear(base.getBase(), 1985));

	}

}
