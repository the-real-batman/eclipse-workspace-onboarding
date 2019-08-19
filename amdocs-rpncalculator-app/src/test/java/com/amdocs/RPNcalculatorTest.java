package com.amdocs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RPNcalculatorTest {

	@Test
	public void testSimpleAddition() {
		RPNCalculator rpnCalculator=new RPNCalculator();
		double actualResult = rpnCalculator.evaluate("10 15 +");
		double expectedResult= 25.0;
		assertEquals(expectedResult, actualResult,0.0001);
		
		actualResult = rpnCalculator.evaluate("10 115 +");
		expectedResult= 125.0;
		assertEquals(expectedResult, actualResult,0.0001);
		
	}
	
}
