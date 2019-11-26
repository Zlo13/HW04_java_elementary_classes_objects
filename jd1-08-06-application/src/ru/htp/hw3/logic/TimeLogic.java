package ru.htp.hw3.logic;

import ru.htp.hw3.entity.Time;

public class TimeLogic {

	public Time testTime(Time time) {

		if (time.getHours() > 24 || time.getMinutes() > 59 || time.getSeconds() > 59) {
			System.out.println("Не существующее время");
			time.setHours(0);
			time.setMinutes(0);
			time.setSeconds(0);
		}
		if (time.getHours() == 24 && time.getMinutes() > 0 && time.getSeconds() > 0) {
			System.out.println("Не существующее время");
			time.setHours(0);
			time.setMinutes(0);
			time.setSeconds(0);
		}
		return time;
	}
}