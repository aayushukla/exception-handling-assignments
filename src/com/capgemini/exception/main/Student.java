package com.capgemini.exception.main;

import java.util.regex.Pattern;

public class Student {
	private int rollNumber;
	private String name;
	private int age;
	private String course;

	public Student(int rollNumber, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
		super();
		this.rollNumber = rollNumber;
		if(Pattern.matches("[a-zA-Z]+", name))
			this.name = name;
		else 
			throw new NameNotValidException("Name entered is not valid");
		if(age < 15 | age > 21)
			throw new AgeNotWithinRangeException("Age should be between 15 and 21");
		else
			this.age = age;
		this.course = course;
	}

	public Student() {
		super();

	}

	
	

}
