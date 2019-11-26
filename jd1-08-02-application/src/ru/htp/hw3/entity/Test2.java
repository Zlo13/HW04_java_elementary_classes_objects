package ru.htp.hw3.entity;

public class Test2 {

	private String name;
	private String surname;

	public Test2() {
		name = "Имя";
		surname = "Фамилия";
	}

	public Test2(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
