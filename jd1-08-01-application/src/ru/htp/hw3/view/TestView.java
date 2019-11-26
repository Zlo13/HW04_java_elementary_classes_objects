package ru.htp.hw3.view;

import ru.htp.hw3.entity.Test1;
import ru.htp.hw3.logic.Test1Logic;

public class TestView {

	public void printNum(Test1 test) {
		System.out.println("Число А = " + test.getNumA());
		System.out.println("Число В = " + test.getNumB());
	}

	public void printSumNum(Test1Logic sumAB, Test1 test) {
		System.out.println("------------");
		System.out.print(test.getNumA() + " + " + test.getNumB() + " = ");
		System.out.println(sumAB.sum(test));

	}

	public void printMaxNum(Test1Logic maxAB, Test1 test) {
		System.out.println("------------");
		System.out.print("Макс. А и В = ");
		System.out.println(maxAB.max(test));
	}

}
