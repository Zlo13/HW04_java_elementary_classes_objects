package ru.htp.hw3.entity;

import java.util.Arrays;

//Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость
//(массив из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность 
//вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.

public class Student {

	private String name;
	private String surname;
	private int groupNum;
	private int[] performance = new int[PERFORMANCE_COUNT];

	private static final int PERFORMANCE_COUNT = 5;

	public Student() {
		name = " - Имя - ";
		surname = " - Фамилия - ";
		groupNum = 0;

	}

	public Student(String name, String surname, int[] performance, int groupNum) {
		this.name = name;
		this.surname = surname;
		this.performance = performance;
		this.groupNum = groupNum;
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

	public int getGroupNum() {
		return groupNum;
	}

	public void setGroupNum(int groupNum) {
		this.groupNum = groupNum;
	}

	public int[] getPerformance() {
		return performance;
	}

	public void setPerformance(int[] performance) {
		this.performance = performance;
	}

	public void setPerformance(int a, int b, int c, int d, int e) {
		this.performance[0] = 1;
		this.performance[1] = 2;
		this.performance[2] = 3;
		this.performance[3] = 4;
		this.performance[4] = 5;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + groupNum;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Arrays.hashCode(performance);
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		Student other = (Student) obj;
		if (groupNum != other.groupNum)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (!Arrays.equals(performance, other.performance))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

}
