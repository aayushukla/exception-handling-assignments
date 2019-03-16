package com.capgemini.exception.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.exception.main.Factorial;
import com.capgemini.exception.main.InvalidInputException;
public class FactorialTest {

	Factorial factorial;
	
	@Test
	public void testForValidInput() throws InvalidInputException
	{
		factorial= new Factorial(5);
		assertEquals(120,factorial.getFactorial(factorial.getNum()));
	}
	
	@Test(expected=InvalidInputException.class)
	public void testForInvalidInput() throws InvalidInputException
	{
		factorial= new Factorial(1);
		assertEquals(120,factorial.getFactorial(factorial.getNum()));
	}
	
	
}
