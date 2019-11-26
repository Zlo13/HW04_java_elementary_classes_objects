package ru.htp.hw3.logic;

import ru.htp.hw3.entity.Student;

public class StudentLogic {

	public void bestStudent(Student student) {

		int[] marks = student.getPerformance();

		for (int i = 0; i < marks.length; i++) {
			if (marks[i] == 9 || marks[i] == 10) {

			}
		}
		System.out.println(student.getName() + " -- " + student.getSurname() + " -- " + student.getGroupNum());
	}

	public void bestStudents(Student[] mas) {

		for (Student i : mas) {
			int b = 10; 
			for (int j : i.getPerformance()) {
				if (j < b) {
					b = j;
				}
			}
			if (b >= 9) {
				System.out.println(i.getName() + " -- " + i.getSurname() + " -- " + i.getGroupNum());
			}
		}
	}

}