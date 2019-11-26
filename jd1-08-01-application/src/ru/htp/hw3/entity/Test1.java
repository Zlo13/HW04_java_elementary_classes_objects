package ru.htp.hw3.entity;

public class Test1 {

	private int numA;
	private int numB;

	public Test1(int numA, int numB) {
		this.numA = numA;
		this.numB = numB;
	}

	public int getNumA() {
		return numA;
	}

	public void setNumA(int numA) {
		this.numA = numA;
	}

	public int getNumB() {
		return numB;
	}

	public void setNumB(int numB) {
		this.numB = numB;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numA;
		result = prime * result + numB;
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
		Test1 other = (Test1) obj;
		if (numA != other.numA)
			return false;
		if (numB != other.numB)
			return false;
		return true;
	}

}
