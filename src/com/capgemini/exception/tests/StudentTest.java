package com.capgemini.exception.tests;

import org.junit.Test;

import com.capgemini.exception.main.AgeNotWithinRangeException;
import com.capgemini.exception.main.NameNotValidException;
import com.capgemini.exception.main.Student;

public class StudentTest {

	Student student;

	@Test
	public void testForAgeWithinRangeException() {
		try {
			student = new Student(1, "aayush", 19, "CSE");
		} catch (Exception e) {
			System.out.println("error");
		}
	}

	@Test(expected = AgeNotWithinRangeException.class)
	public void testForAgeNot() throws AgeNotWithinRangeException, NameNotValidException {

		student = new Student(1, "aayush", 219, "CSE");

	}
	
	@Test
	public void testForValidName() {
		try {
			student = new Student(1, "aayush", 16, "CSE");
		} catch (Exception e) {
			System.out.println("error");
		}
	}
	
	@Test(expected = NameNotValidException.class)
	public void testForInvalidName() throws AgeNotWithinRangeException, NameNotValidException {
		student = new Student(1, "aa234ush", 21, "CSE");

	}
	
	
}
