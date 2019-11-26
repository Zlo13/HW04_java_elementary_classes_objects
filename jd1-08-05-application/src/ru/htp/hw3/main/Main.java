package ru.htp.hw3.main;

import ru.htp.hw3.entity.Counter;
import ru.htp.hw3.logic.CounterLogic;
import ru.htp.hw3.view.CounterView;

//5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или 
//уменьшать свое значение на единицу в заданном диапазоне. Предусмотрите инициализацию 
//счетчика значениями по умолчанию и произвольными значениями. Счетчик имеет методы 
//увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние. 
//Написать код, демонстрирующий все возможности класса. 

public class Main {

	public static void main(String[] args) {

		Counter counter1 = new Counter();
		Counter counter2 = new Counter(10, 100, 99);

		CounterView view = new CounterView();

		view.printCurrentState("Счетчик1", counter1);
		view.printCurrentState("Счетчик2", counter2);

		CounterLogic changeCurrent = new CounterLogic();

		changeCurrent.increase(counter2);
		view.printCurrentState("Счетчик2", counter2);

		changeCurrent.increase(counter2);
		view.printCurrentState("Счетчик2", counter2);

		changeCurrent.decrease(counter1);
		view.printCurrentState("Счетчик1", counter1);

	}

}
