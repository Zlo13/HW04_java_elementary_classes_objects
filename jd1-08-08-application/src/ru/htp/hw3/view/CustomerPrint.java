package ru.htp.hw3.view;

import java.util.List;

import ru.htp.hw3.entity.Customer;

public class CustomerPrint {
	
	public void printList (List<Customer> list) {
		for (Customer x: list) {
			System.out.println(x);
		}
	}

}
