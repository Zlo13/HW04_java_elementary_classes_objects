package ru.htp.hw3.view;

import java.util.Scanner;

import ru.htp.hw3.entity.Time;

public class TimeView {

	public void timeViewer(Time time) {

		System.out.println(time.getHours() + ":" + time.getMinutes() + ":" + time.getSeconds());
	}

	public Time setTime(Time time) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Часы");
		time.setHours(sc.nextInt());
		System.out.println("Минуты");
		time.setMinutes(sc.nextInt());
		System.out.println("Секунды");
		time.setSeconds(sc.nextInt());
		return time;

	}

}
