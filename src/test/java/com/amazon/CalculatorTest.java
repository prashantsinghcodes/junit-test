package com.amazon;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	Calculator calculator = new Calculator();
	
	@Before
	public void BeforeTest()
	{
		calculator.clear();
	}
	
	@Test
	public void testSum() {
		calculator.add(5,6);
		Assert.assertEquals(calculator.getResult(),11);
	}
	
	
	@Test
	public void testSub() {
		calculator.subtract(9,7);
		Assert.assertEquals(calculator.getResult(), 2);
	}
	
	@Test
	public void testMultiply() {
		calculator.multiply(6,8);
		Assert.assertEquals(calculator.getResult(), 48);
	}
    
	@Test
	public void testDivide() {
		calculator.division(9,3);
		Assert.assertEquals(calculator.getResult(), 3);
	}
}
