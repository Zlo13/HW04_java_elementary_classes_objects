package ru.htp.hw3.view;

import java.util.List;
import ru.htp.hw3.entity.Train;

public class TrainView {

	public void print(List<Train> list) {
		for (Train t : list)
			System.out.println(t);
	}
}
