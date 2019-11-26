package ru.htp.hw3.entity;

import java.math.BigInteger;
import java.util.List;

/*
8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы 
   и метод  toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. 
   Задать критерии выбора данных и вывести эти данные на консоль.  

			Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.  
			Найти и вывести:  
			a) список покупателей в алфавитном порядке;  
			b) список покупателей, у которых номер кредитной карточки находится в заданном интервале 
*/

public class CustomerBase {

	private List<Customer> base;

	public CustomerBase(List<Customer> base) {

		this.base = base;
	}

	public void addCustomer(String name, String patronymic, String surname, String address, BigInteger creditCardNumber,
			long bankAccountNumber) {
		this.base.add(new Customer(name, patronymic, surname, address, creditCardNumber, bankAccountNumber));
	}
	
	public List<Customer> getBase() {
		return base;
	}

	public void setBase(List<Customer> base) {
		this.base = base;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((base == null) ? 0 : base.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerBase other = (CustomerBase) obj;
		if (base == null) {
			if (other.base != null)
				return false;
		} else if (!base.equals(other.base))
			return false;
		return true;
	}
	
	

}
