package com.capgemini.exception.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.exception.main.CountryNotValidException;
import com.capgemini.exception.main.EmployeeNameInvalidException;
import com.capgemini.exception.main.TaxCalculator;
import com.capgemini.exception.main.TaxNotEligibleException;

public class TaxCalculatorTest {

	TaxCalculator employee;
	@Test
	public void testEmployeeIsIndian()
	{
		try {
			employee= new TaxCalculator("aayush",true,50_000);
		}
		catch(Exception e) {
			System.out.println("as");
		}
	}
	
	@Test(expected=CountryNotValidException.class)
	public void testEmployeeNotIndian() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException
	{
			employee= new TaxCalculator("aayush",false,50_000);
	}
	
	@Test
	public void testEmployeeValidName()
	{
		try {
			employee= new TaxCalculator("aaayush",true,50_000);
		}
		catch(Exception e) {
			System.out.println("as");
		}
	}
	@Test(expected=EmployeeNameInvalidException.class)
	public void testEmployeeInvalidName() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException
	{
		employee= new TaxCalculator("aayua312",true,50_000);
	}
	
	@Test
	public void testForTaxCalculationAboveOneLakh() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException
	{
		TaxCalculator employee1= new TaxCalculator("aayush",true,190_000);
		assertEquals(15200, employee1.taxCalculator(employee1.getEmployeeSalary()),0.1);
	}
	
	@Test
	public void testForTaxCalculationBelowOneLakhAbove50k() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException
	{
		TaxCalculator employee1= new TaxCalculator("aayush",true,90_000);
		assertEquals(5400, employee1.taxCalculator(employee1.getEmployeeSalary()),0.1);
	}
	
	@Test
	public void testForTaxCalculation30kTo50k() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException
	{
		TaxCalculator employee1= new TaxCalculator("aayush",true,40_000);
		assertEquals(2000, employee1.taxCalculator(employee1.getEmployeeSalary()),0.1);
	}
	
	@Test
	public void testForTaxCalculation10kTo30k() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException
	{
		TaxCalculator employee1= new TaxCalculator("aayush",true,20_000);
		assertEquals(800, employee1.taxCalculator(employee1.getEmployeeSalary()),0.1);
	}

}