package ru.htp.hw3.main;

import java.util.ArrayList;
import ru.htp.hw3.entity.Depot;
import ru.htp.hw3.entity.Train;
import ru.htp.hw3.logic.TrainLogic;
import ru.htp.hw3.view.TrainView;

/*
4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, 
время отправления. Создайте данные в массив из пяти элементов типа Train, добавьте 
возможность сортировки элементов массива по номерам поездов. Добавьте возможность 
вывода информации о поезде, номер которого введен пользователем. Добавьте возможность 
сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения 
должны быть упорядочены по времени отправления. 
*/

public class Main {

	public static void main(String[] args) {

		Depot depot = new Depot(new ArrayList<Train>());
		TrainView print = new TrainView();
		TrainLogic logic = new TrainLogic();

		depot.addTrain("Москва     - ", 321, 12, 10);
		depot.addTrain("Минск      - ", 123, 23, 11);
		depot.addTrain("Братск     - ", 617, 13, 25);
		depot.addTrain("Красноярск - ", 231, 6, 30);
		depot.addTrain("Красноярск - ", 120, 7, 20);
		
		print.print(logic.sortByNum(depot.getTrains()));
		System.out.println();
		
		print.print(logic.findTrainByNum(depot.getTrains(), 617));
		System.out.println();
		
		print.print(logic.sortByDestinationAndTime(depot.getTrains()));
		
		

	}

}
