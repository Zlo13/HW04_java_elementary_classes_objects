package ru.htp.hw3.main;

import ru.htp.hw3.entity.Student;
import ru.htp.hw3.logic.StudentLogic;
import ru.htp.hw3.view.StudentsView;

public class Main {

	public static void main(String[] args) {

		Student[] student = new Student[10];

		student[0] = new Student("Petr", "petrov", new int[] { 9, 10, 9, 10, 9 }, 8);
		student[1] = new Student("Vasiliy", "Vasiliev", new int[] { 8, 10, 7, 10, 9 }, 7);
		student[2] = new Student("Anton", "Volkov", new int[] { 9, 9, 9, 10, 9 }, 3);
		student[3] = new Student("Artem", "Kotov", new int[] { 9, 10, 9, 5, 9 }, 5);
		student[4] = new Student("Anna", "Filatova", new int[] { 9, 7, 9, 10, 9 }, 6);
		student[5] = new Student("Ktya", "Gavrilova", new int[] { 9, 10, 9, 10, 9 }, 10);
		student[6] = new Student("Kostya", "Gerasimov", new int[] { 9, 10, 9, 10, 9 }, 8);
		student[7] = new Student("Nikolay", "Kolin", new int[] { 9, 10, 9, 10, 9 }, 4);
		student[8] = new Student("Aleksey", "Fomin", new int[] { 9, 4, 9, 6, 8 }, 8);
		student[9] = new Student("Iliya", "Hrenov", new int[] { 9, 9, 9, 10, 9 }, 2);

		StudentsView testPrint = new StudentsView();
		testPrint.print(student);

		System.out.println();

		StudentLogic logic = new StudentLogic();

		logic.bestStudents(student);

	}

}
