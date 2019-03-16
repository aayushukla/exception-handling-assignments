package com.capgemini.exception.tests;

import org.junit.Test;

import com.capgemini.exception.main.DayEnteredNotValidException;
import com.capgemini.exception.main.MonthEnteredNotValidException;
import com.capgemini.exception.main.MyDate;


public class MyDateTest {

	MyDate object1;
	MyDate object2;
	MyDate object3;
	MyDate object4;
	MyDate object5;
	MyDate object6;
	MyDate object7;
	
	// test for valid days
	@Test
	public void testForValidDay1()
	{
		try {
			object1 = new MyDate(30,1,1998);
		} catch (Exception e) {
			System.out.println("invalid date entered");
		}
	}
	
	@Test
	public void testForValidDay2()
	{
		try {
			object2 = new MyDate(11,12,1998);
		} catch (Exception e) {
			System.out.println("invalid date entered");
		}
	}
	
	@Test
	public void testForValidDay3()
	{
		try {
			object3 = new MyDate(11,12,1998);
		} catch (Exception e) {
			System.out.println("invalid date entered");
		}
	}
	
	@Test
	public void testForValidDay4()
	{
		try {
			object4 = new MyDate(11,12,1998);
		} catch (Exception e) {
			System.out.println("invalid date entered");
		}
	}
	
	@Test
	public void testForValidDay5()
	{
		try {
			object5 = new MyDate(21,2,2998);
		} catch (Exception e) {
			System.out.println("invalid date entered");
		}
	}
	
	@Test
	public void testForValidDay6()
	{
		try {
			object6 = new MyDate(21,12,1998);
		} catch (Exception e) {
			System.out.println("invalid date entered");
		}
	}
	
	@Test
	public void testForValidDa7()
	{
		try {
			object7 = new MyDate(23,12,2009);
		} catch (Exception e) {
			System.out.println("invalid date entered");
		}
	}
	
	
	// date exception tests
	
	@Test(expected = DayEnteredNotValidException.class)
	public void testForInvalidDay1() throws DayEnteredNotValidException, MonthEnteredNotValidException
	{
		object1 = new MyDate(30,2,1998);
	}
	
	@Test(expected = DayEnteredNotValidException.class)
	public void testForInvalidDay2() throws DayEnteredNotValidException, MonthEnteredNotValidException
	{
		object2 = new MyDate(31,4,1998);
	}
	
	@Test(expected = DayEnteredNotValidException.class)
	public void testForInvalidDay3() throws DayEnteredNotValidException, MonthEnteredNotValidException
	{
		object3 = new MyDate(32,12,1998);
	}
	
	@Test(expected = DayEnteredNotValidException.class)
	public void testForInvalidDay4() throws DayEnteredNotValidException, MonthEnteredNotValidException
	{
		object4 = new MyDate(32,12,1998);
	}
	
	@Test(expected = DayEnteredNotValidException.class)
	public void testForInvalidDay5() throws DayEnteredNotValidException, MonthEnteredNotValidException
	{
		object5 = new MyDate(32,12,1998);
	}
	
	@Test(expected = DayEnteredNotValidException.class)
	public void testForInvalidDay6() throws DayEnteredNotValidException, MonthEnteredNotValidException
	{
		object6 = new MyDate(32,12,1998);
	}
	
	// test for valid month
	@Test
	public void testForValidMonth1()
	{
		try {
			object1 = new MyDate(11,12,1998);
		} catch (Exception e) {
			System.out.println("invalid month entered");
		}
	}
	
	@Test
	public void testForValidMonth2()
	{
		try {
			object2 = new MyDate(11,12,1998);
		} catch (Exception e) {
			System.out.println("invalid month entered");
		}
	}
	@Test
	public void testForValidMonth3()
	{
		try {
			object3= new MyDate(11,12,1998);
		} catch (Exception e) {
			System.out.println("invalid month entered");
		}
	}
	@Test
	public void testForValidMonth4()
	{
		try {
			object4 = new MyDate(11,12,1998);
		} catch (Exception e) {
			System.out.println("invalid month entered");
		}
	}
	@Test
	public void testForValidMonth5()
	{
		try {
			object5 = new MyDate(11,12,1998);
		} catch (Exception e) {
			System.out.println("invalid month entered");
		}
	}
	@Test
	public void testForValidMonth6()
	{
		try {
			object6 = new MyDate(11,12,1998);
		} catch (Exception e) {
			System.out.println("invalid month entered");
		}
	}
	@Test
	public void testForValidMonth7()
	{
		try {
			object7 = new MyDate(11,12,1998);
		} catch (Exception e) {
			System.out.println("invalid month entered");
		}
	}
	
	//test for invalid month
	@Test(expected = MonthEnteredNotValidException.class)
	public void testForInvalidMonth() throws DayEnteredNotValidException, MonthEnteredNotValidException
	{
		object1 = new MyDate(30,22,1998);
	}

}
