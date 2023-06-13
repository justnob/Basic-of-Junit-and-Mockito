package com.amar.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyCalculatorTest {

	private MyCalculator math = new MyCalculator();
	
	
	
	@Test
	void test1() {
		
		int result = math.AdditionCalc(new int[] {1,2,3,4,5});
		
		int expectedResult = 15;
		
		assertEquals(expectedResult, result);
		
	}
	
	@Test
	void test2() {
		
		int result = math.AdditionCalc(new int[] {});
		
		int expectedResult = 0 ;
		
		assertEquals(expectedResult, result, "Failed");
		
	}

}
