package ru.htp.hw3.entity;

/*
4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, 
время отправления. Создайте данные в массив из пяти элементов типа Train, добавьте 
возможность сортировки элементов массива по номерам поездов. Добавьте возможность 
вывода информации о поезде, номер которого введен пользователем. Добавьте возможность 
сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения 
должны быть упорядочены по времени отправления. 
*/

public class Train {

	private String destination;
	private int trainNumber;
	private int departureHour;
	private int departureMinute;

	public Train() {
		destination = "Destination";
		trainNumber = 0;
		departureHour = 24;
		departureMinute = 60;
	}

	public Train(String destination, int trainNumber, int departureHour, int departureMinute) {
		this.destination = destination;
		this.trainNumber = trainNumber;
		this.departureHour = departureHour;
		this.departureMinute = departureMinute;
	}
	

	@Override
	public String toString() {
		return "Пункт назначения " + destination + "  Номер поезда " + trainNumber + "  Время отправления " + departureHour
				+ ":" + departureMinute;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public int getDepartureHour() {
		return departureHour;
	}

	public void setDepartureHour(int departureHour) {
		this.departureHour = departureHour;
	}

	public int getDepartureMinute() {
		return departureMinute;
	}

	public void setDepartureMinute(int departureMinute) {
		this.departureMinute = departureMinute;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + departureHour;
		result = prime * result + departureMinute;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + trainNumber;
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
		Train other = (Train) obj;
		if (departureHour != other.departureHour)
			return false;
		if (departureMinute != other.departureMinute)
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (trainNumber != other.trainNumber)
			return false;
		return true;
	}

}
