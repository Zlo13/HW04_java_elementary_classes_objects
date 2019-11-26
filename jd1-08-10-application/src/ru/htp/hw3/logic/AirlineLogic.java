package ru.htp.hw3.logic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ru.htp.hw3.entity.Airline;
import ru.htp.hw3.entity.DaysOfTheWeek;

public class AirlineLogic {

	public List<Airline> findDestination(List<Airline> list, String destination) {
		// список рейсов для заданного пункта назначения

		List<Airline> air = new ArrayList<>();

		for (Airline x : list) {
			if (x.getDestination().equalsIgnoreCase(destination)) {
				air.add(x);
			}
		}
		return air;
	}

	public List<Airline> fideDaysOfTheWeek(List<Airline> list, DaysOfTheWeek day) {
		// список рейсов для заданного дня недели

		List<Airline> air = new ArrayList<>();
		for (Airline x : list) {
			for (DaysOfTheWeek z : x.getDaysOfTheWeek()) {
				if (z == day) {
					air.add(x);
				}
			}
		}
		return air;

	}

	public List<Airline> findDayAndTime(List<Airline> list, Date time, DaysOfTheWeek day) {
		// список рейсов для заданного дня недели, время вылета для которых больше
		// заданного

		List<Airline> air = new ArrayList<>();

		for (Airline x : list) {
			for (DaysOfTheWeek z : x.getDaysOfTheWeek()) {
				if (z == day) {
					if (x.getDepartureTime().compareTo(time) >= 0) {
						air.add(x);
					}
				}
			}
		}
		return air;
	}
}
