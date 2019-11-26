package ru.htp.hw3.logic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import ru.htp.hw3.entity.Train;

/*
4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, 
время отправления. Создайте данные в массив из пяти элементов типа Train, добавьте 
возможность сортировки элементов массива по номерам поездов. Добавьте возможность 
вывода информации о поезде, номер которого введен пользователем. Добавьте возможность 
сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения 
должны быть упорядочены по времени отправления. 
*/

public class TrainLogic {

	public List<Train> sortByNum(List<Train> list) {
		list.sort(Comparator.comparingInt(Train::getTrainNumber));
		return list;
	}

	public List<Train> findTrainByNum(List<Train> list, int num) {
		List<Train> tr = new ArrayList<>();
		for (Train x : list) {
			if (x.getTrainNumber() == num) {
				tr.add(x);
			}
		}
		return tr;
	}

	public List<Train> sortByDestinationAndTime(List<Train> list) {

		Train tmp;
		int a = 0;

		list.sort(Comparator.comparing(Train::getDestination));
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {

				a = list.get(j).getDepartureHour();
				if (a > list.get(j).getDepartureHour()) {
					tmp = list.get(j);
					list.set(j, list.get(j));
					list.set(j, tmp);
				}
			}
		}
		return list;
	}
}
