package ru.htp.hw3.entity;

//7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, 
//вычисления площади, периметра и точки пересечения медиан.

public class Side {
	private Point a;
	private Point b;

	public Side(Point a, Point b) {
		this.a = a;
		this.b = b;
	}

	public Point getA() {
		return a;
	}

	public Point getB() {
		return b;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Side other = (Side) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		return true;
	}
	
	

}
