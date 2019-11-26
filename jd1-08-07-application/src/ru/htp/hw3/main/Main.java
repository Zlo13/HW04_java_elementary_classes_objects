package ru.htp.hw3.main;

import java.util.Locale;

import ru.htp.hw3.entity.Point;
import ru.htp.hw3.logic.Logic;

// 7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, 
// вычисления площади, периметра и точки пересечения медиан. 

public class Main {

	public static void main(String[] args) {

		Point a = new Point(-1, 3);
		Point b = new Point(2, 7);
		Point c = new Point(4, 2);
		
		System.out.printf(Locale.US, "Координаты вершин: a(%.1f,%.1f); b(%.1f,%.1f); c(%.1f,%.1f).%n%n", a.getX(),
				a.getY(), b.getX(), b.getY(), c.getX(), c.getY());

		Logic logic = new Logic();

		System.out.printf(Locale.US, "Сторона АВ = %.1f%n", logic.calculateSide(a, b));
		System.out.printf(Locale.US, "Сторона BC = %.1f%n", logic.calculateSide(b, c));
		System.out.printf(Locale.US, "Сторона CA = %.1f%n%n", logic.calculateSide(c, a));

		System.out.printf(Locale.US, "Периметр треугольника = %.1f%n", logic.calculatePerimeter(a, b, c));

		System.out.printf(Locale.US, "Площадь треугольника = %.1f%n", logic.calculateArea(a, b, c));

		Point o = logic.pointMedianIntersection(a, b, c);

		System.out.printf(Locale.US, "Точка пересечения медиан = o (%.1f,%.1f)", o.getX(), o.getY());

	}

}
