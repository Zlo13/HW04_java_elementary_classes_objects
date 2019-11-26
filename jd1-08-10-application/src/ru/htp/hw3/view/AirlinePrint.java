package ru.htp.hw3.view;

import java.util.List;

import ru.htp.hw3.entity.Airline;

public class AirlinePrint {
	
	public void AirlineView (List <Airline> list) {
		for (Airline x: list) {
			System.out.println(x);
		}
	}

}
