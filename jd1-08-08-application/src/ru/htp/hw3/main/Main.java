package ru.htp.hw3.main;

import java.math.BigInteger;
import java.util.ArrayList;

import ru.htp.hw3.entity.CustomerBase;
import ru.htp.hw3.logic.CustomerLogic;
import ru.htp.hw3.view.CustomerPrint;

/*
 8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы 
    и метод  toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. 
    Задать критерии выбора данных и вывести эти данные на консоль.  

			Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.  
			Найти и вывести:  
			a) список покупателей в алфавитном порядке;  
			b) список покупателей, у которых номер кредитной карточки находится в заданном интервале 
*/

public class Main {

	public static void main(String[] args) {

		CustomerBase clients = new CustomerBase(new ArrayList<>());

		clients.addCustomer("Иван", "Николаевич", "Иванов", "Москва", new BigInteger("111111111111111"), 123456789);
		clients.addCustomer("Андрей", "Станиславович", "Петров", "Иркутск", new BigInteger("222222222222222"),
				256123456);
		clients.addCustomer("Сергей", "Викторович", "Плиханов", "Братск", new BigInteger("333333333333333"), 256456456);
		clients.addCustomer("Виктор", "Петрович", "Шленев", "Минск", new BigInteger("555555555555555"), 256456837);

		CustomerLogic customerLogic = new CustomerLogic();
		CustomerPrint print = new CustomerPrint();

		print.printList(customerLogic.sortName(clients.getBase()));

		System.out.println();

		print.printList(
				customerLogic.getCustomerByCreditCardRange(clients.getBase(), "200000000000000", "400000000000000"));

	}

}
