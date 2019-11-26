package ru.htp.hw3.entity;

import java.util.Date;
import java.util.List;

public class FlightSchedule { // расписание полетов

	private List<Airline> airlines;

	public FlightSchedule(List<Airline> airlines) {
		this.airlines = airlines;
	}

	public void addAirline(String destination, int flightNumber, String aircraftType, Date departureTime,
			DaysOfTheWeek[] daysOfTheWeeks) {
		airlines.add(new Airline(destination, flightNumber, aircraftType, departureTime, daysOfTheWeeks));
	}

	public List<Airline> getAirlines() {
		return airlines;
	}

	public void setAirlines(List<Airline> airlines) {
		this.airlines = airlines;
	}

}
