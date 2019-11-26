package ru.htp.hw3.entity;

//7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, 
//вычисления площади, периметра и точки пересечения медиан.

public class Triangle {

	private Side A;
	private Side B;
	private Side C;

	public Triangle(Side a, Side b, Side c) {
		A = a;
		B = b;
		C = c;
	}

	public Triangle() {
	}

	public Side getA() {
		return A;
	}

	public void setA(Side a) {
		A = a;
	}

	public Side getB() {
		return B;
	}

	public void setB(Side b) {
		B = b;
	}

	public Side getC() {
		return C;
	}

	public void setC(Side c) {
		C = c;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((A == null) ? 0 : A.hashCode());
		result = prime * result + ((B == null) ? 0 : B.hashCode());
		result = prime * result + ((C == null) ? 0 : C.hashCode());
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
		Triangle other = (Triangle) obj;
		if (A == null) {
			if (other.A != null)
				return false;
		} else if (!A.equals(other.A))
			return false;
		if (B == null) {
			if (other.B != null)
				return false;
		} else if (!B.equals(other.B))
			return false;
		if (C == null) {
			if (other.C != null)
				return false;
		} else if (!C.equals(other.C))
			return false;
		return true;
	}
	
	

}
