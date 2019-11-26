package ru.htp.hw3.main;

//	6. Составьте описание класса для представления времени. Предусмотрте возможности 
//	установки времени и изменения его отдельных полей (час, минута, секунда) с проверкой 
//	допустимости вводимых значений. В случае недопустимых значений полей поле 
//	устанавливается в значение 0. Создать методы изменения времени на заданное 
//	количество часов, минут и секунд. 

import ru.htp.hw3.entity.Time;
import ru.htp.hw3.logic.TimeLogic;
import ru.htp.hw3.view.TimeView;

public class Main {

	public static void main(String[] args) {
		Time time = new Time(23, 50, 12);

		TimeLogic test = new TimeLogic();
		TimeView timeView = new TimeView();

		timeView.timeViewer(time);

		test.testTime(timeView.setTime(time));

		timeView.timeViewer(time);

	}

}
