package ru.htp.hw3.view;

import ru.htp.hw3.entity.Student;

public class StudentsView {

	public void print(Student[] student) {

		for (int i = 0; i < student.length; i++) {
			System.out.print(student[i].getName() + " --- ");
			System.out.print(student[i].getSurname() + " --- ");
			System.out.println(student[i].getGroupNum());
		}

	}
	

}
