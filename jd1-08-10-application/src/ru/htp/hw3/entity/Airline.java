package ru.htp.hw3.entity;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/*
 * 10. Создать класс Airline, спецификация которого приведена ниже. Определить конст рукторы, set- и get- методы
 * 	   и метод  toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
 * 	   методами. Задать критерии выбора данных и вывести эти данные на консоль.
 *         Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 *         Найти и вывести:
 *         a) список рейсов для заданного пункта назначения;
 *         b) список рейсов для заданного дня недели;
 *         c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

public class Airline {

	private String destination; // пункт назначения
	private int flightNumber; // номер рейса
	private String aircraftType; // тип самолета
	private Date departureTime; // время вылета
	private DaysOfTheWeek[] daysOfTheWeek; // день недели

	private static SimpleDateFormat df = new SimpleDateFormat("HH:mm");

	public Airline(String destination, int flightNumber, String aircraftType, Date departureTime,
			DaysOfTheWeek[] daysOfTheWeek) {

		this.destination = destination;
		this.flightNumber = flightNumber;
		this.aircraftType = aircraftType;
		this.departureTime = departureTime;
		this.daysOfTheWeek = daysOfTheWeek;
	}

	public static SimpleDateFormat getDf() {
		return df;
	}

	@Override
	public String toString() {
		return "Пункт назначения - " + destination + ", номер рейса - " + flightNumber + ", тип самолета - "
				+ aircraftType + ", время вылета - " + df.format(departureTime) + ", день недели - "
				+ Arrays.toString(daysOfTheWeek);
	}

	public static void setDf(SimpleDateFormat df) {
		Airline.df = df;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public DaysOfTheWeek[] getDaysOfTheWeek() {
		return daysOfTheWeek;
	}

	public void setDaysOfTheWeek(DaysOfTheWeek[] daysOfTheWeek) {
		this.daysOfTheWeek = daysOfTheWeek;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aircraftType == null) ? 0 : aircraftType.hashCode());
		result = prime * result + Arrays.hashCode(daysOfTheWeek);
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + flightNumber;
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
		Airline other = (Airline) obj;
		if (aircraftType == null) {
			if (other.aircraftType != null)
				return false;
		} else if (!aircraftType.equals(other.aircraftType))
			return false;
		if (!Arrays.equals(daysOfTheWeek, other.daysOfTheWeek))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flightNumber != other.flightNumber)
			return false;
		return true;
	}
}