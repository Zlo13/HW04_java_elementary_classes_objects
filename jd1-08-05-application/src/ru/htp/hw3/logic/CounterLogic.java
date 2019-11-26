package ru.htp.hw3.logic;

import ru.htp.hw3.entity.Counter;

//5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или 
//уменьшать свое значение на единицу в заданном диапазоне. Предусмотрите инициализацию 
//счетчика значениями по умолчанию и произвольными значениями. Счетчик имеет методы 
//увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние. 
//Написать код, демонстрирующий все возможности класса. 

public class CounterLogic {

	public void increase(Counter counter) {

		if (counter.getCurrentState() < counter.getMax()) {

			counter.setCurrentState(counter.getCurrentState() + 1);

		} else {

			counter.setCurrentState(counter.getMin());

		}

	}

	public void decrease(Counter counter) {

		if (counter.getCurrentState() > counter.getMin()) {

			counter.setCurrentState(counter.getCurrentState() - 1);

		} else {

			counter.setCurrentState(counter.getMax());

		}

	}
}
