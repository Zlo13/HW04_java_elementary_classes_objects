package ru.htp.hw3.main;

import ru.htp.hw3.entity.Test1;
import ru.htp.hw3.logic.Test1Logic;
import ru.htp.hw3.view.TestView;

public class Main {

	public static void main(String[] args) {

		Test1 test11 = new Test1(5, 10);

		Test1Logic logic = new Test1Logic();

		TestView print = new TestView();

		logic.sum(test11);
		logic.max(test11);

		print.printNum(test11);
		print.printSumNum(logic, test11);
		print.printMaxNum(logic, test11);

	}

}
