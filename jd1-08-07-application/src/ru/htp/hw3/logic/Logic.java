package ru.htp.hw3.logic;

import ru.htp.hw3.entity.Point;
import ru.htp.hw3.entity.Side;
import ru.htp.hw3.entity.Triangle;

//7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, 
//вычисления площади, периметра и точки пересечения медиан.

public class Logic {

	public Triangle createTriangle(Point a, Point b, Point c) {
		Side A = new Side(a, b);
		Side B = new Side(b, c);
		Side C = new Side(a, c);
		return new Triangle(A, B, C);
	}

	public double calculateSide(Point a, Point b) {
		return Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
	}

	public double calculatePerimeter(Point a, Point b, Point c) {

		Logic logic = new Logic();
		return logic.calculateSide(a, b) + logic.calculateSide(b, c) + logic.calculateSide(c, a);
	}

	public double calculateArea(Point a, Point b, Point c) {

		double p = calculatePerimeter(a, b, c) / 2;

		Logic logic = new Logic();

		double A = logic.calculateSide(a, b);
		double B = logic.calculateSide(b, c);
		double C = logic.calculateSide(c, a);

		return Math.sqrt(p * (p - A) * (p - B) * (p - C));
	}
	public Point pointMedianIntersection(Point a, Point b, Point c) {
		
        double x = (a.getX() + b.getX() + c.getX()) / 3;
        double y = (a.getY() + b.getY() + c.getY()) / 3;
        
        return new Point(x, y);
    }
}
