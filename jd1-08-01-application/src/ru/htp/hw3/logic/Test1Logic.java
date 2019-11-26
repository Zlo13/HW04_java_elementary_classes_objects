package ru.htp.hw3.logic;

import ru.htp.hw3.entity.Test1;

public class Test1Logic {

	public int sum(Test1 test) {

		int sum;

		sum = test.getNumA() + test.getNumB();

		return sum;

	}

	public int max(Test1 test) {

		int max;

		if (test.getNumA() < test.getNumB()) {
			max = test.getNumB();
		} else {
			max = test.getNumA();
		}
		return max;
	}

}
