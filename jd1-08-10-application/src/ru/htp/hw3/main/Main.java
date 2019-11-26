package ru.htp.hw3.main;

import java.text.ParseException;
import java.util.ArrayList;

import ru.htp.hw3.entity.Airline;
import ru.htp.hw3.entity.DaysOfTheWeek;
import ru.htp.hw3.entity.FlightSchedule;
import ru.htp.hw3.logic.AirlineLogic;
import ru.htp.hw3.view.AirlinePrint;

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

public class Main {

	public static void main(String[] args) throws ParseException {

		FlightSchedule flightSchedule = new FlightSchedule(new ArrayList<Airline>());

		flightSchedule.addAirline("Minsk", 247, "Airbus", Airline.getDf().parse("12:15"),
				new DaysOfTheWeek[] { DaysOfTheWeek.WEDNESDAY, DaysOfTheWeek.TUESDAY });
		flightSchedule.addAirline("Moscow", 123, "Boing", Airline.getDf().parse("08:10"),
				new DaysOfTheWeek[] { DaysOfTheWeek.FRIDAY, DaysOfTheWeek.SUNDAY });
		flightSchedule.addAirline("Bratsk", 747, "Superjet", Airline.getDf().parse("11:25"),
				new DaysOfTheWeek[] { DaysOfTheWeek.THURSDAY });
		flightSchedule.addAirline("Irkutsk", 222, "Boing", Airline.getDf().parse("14:10"),
				new DaysOfTheWeek[] { DaysOfTheWeek.SUNDAY });
		flightSchedule.addAirline("Krasnoyarsk", 123, "Superjet", Airline.getDf().parse("22:15"),
				new DaysOfTheWeek[] { DaysOfTheWeek.FRIDAY });
		flightSchedule.addAirline("Bratsk", 417, "Airbus", Airline.getDf().parse("17:40"),
				new DaysOfTheWeek[] { DaysOfTheWeek.SUNDAY });

		AirlinePrint print = new AirlinePrint();
		AirlineLogic logic = new AirlineLogic();

		print.AirlineView(logic.findDestination(flightSchedule.getAirlines(), "BrAtsk"));

		System.out.println();

		print.AirlineView(logic.fideDaysOfTheWeek(flightSchedule.getAirlines(), DaysOfTheWeek.SUNDAY));

		System.out.println();

		print.AirlineView(logic.findDayAndTime(flightSchedule.getAirlines(), Airline.getDf().parse("8:00"),
				DaysOfTheWeek.FRIDAY));

	}

}
