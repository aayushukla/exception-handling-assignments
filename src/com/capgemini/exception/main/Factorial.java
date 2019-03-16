package com.capgemini.exception.main;

public class Factorial{

	public int num;

	public Factorial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Factorial(int num) {
		super();
		this.num = num;
	}

	public int getFactorial(int num) throws InvalidInputException {
		if (num < 2 || num > 2147483647) {
			throw new InvalidInputException("value entered is wrong");
		} else {
			int fac = 1;
			while (num != 0)

			{
				fac = num * fac;
				num--;
			}
			return fac;
		}
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}
