package com.test1.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.lab1.calculator.Calculator;

public class CalculatorTest {
	private Calculator calculator;
	
	@Before
	public void setUp() {
		calculator = new Calculator();
	}
	@Test
	public void addTest() {
		assertEquals(4, calculator.add(2, 2));
	}
	@Test
	public void subtractTest() {
		assertEquals(4, calculator.subtract(6, 2));
	}
	@Test
	public void multiplyTest() {
		assertEquals(4, calculator.multiply(2, 2));
	}
	@Test
	public void divideTest() {
		assertEquals(4, calculator.divide(8, 2));
	}
	@Test
	public void equalTest() {
		assertTrue(calculator.isEqual(8, 8));
		assertFalse(calculator.isEqual(8, 27));
	}

} 
