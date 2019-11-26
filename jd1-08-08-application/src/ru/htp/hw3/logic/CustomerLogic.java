package ru.htp.hw3.logic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import ru.htp.hw3.entity.Customer;

public class CustomerLogic {

	public List<Customer> sortName(List<Customer> list) {

		list.sort(Comparator.comparing(Customer::getName));

		return list;

	}

	public List<Customer> getCustomerByCreditCardRange(List<Customer> cust, String min, String max) {

		List<Customer> list = new ArrayList<>();

		for (Customer customer : cust) {

			if (customer.getCreditCardNumber().toString().compareTo(min) > 0
					&& customer.getCreditCardNumber().toString().compareTo(max) < 0) {
				list.add(customer);
			}
		}
		return list;
	}
}
