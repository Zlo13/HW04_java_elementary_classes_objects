package ru.htp.hw3.entity;

import java.util.List;

/*
4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, 
время отправления. Создайте данные в массив из пяти элементов типа Train, добавьте 
возможность сортировки элементов массива по номерам поездов. Добавьте возможность 
вывода информации о поезде, номер которого введен пользователем. Добавьте возможность 
сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения 
должны быть упорядочены по времени отправления. 
*/

public class Depot {

	private List<Train> trains;

	public Depot(List<Train> trains) {
		this.trains = trains;
	}

	public void addTrain(String destination, int trainNumber, int departureHour, int departureMinute) {
		this.trains.add(new Train(destination, trainNumber, departureHour, departureMinute));
	}

	public List<Train> getTrains() {
		return trains;
	}

	public void setTrains(List<Train> trains) {
		this.trains = trains;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((trains == null) ? 0 : trains.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Depot other = (Depot) obj;
		if (trains == null) {
			if (other.trains != null)
				return false;
		} else if (!trains.equals(other.trains))
			return false;
		return true;
	}

}
