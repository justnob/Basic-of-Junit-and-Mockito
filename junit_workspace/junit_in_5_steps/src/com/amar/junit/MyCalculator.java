package com.amar.junit;

public class MyCalculator {
	
	public int AdditionCalc(int[] numbers) {
		
		int sum = 0;
		for(int number:numbers) {
			sum += number;
		}
		
		return sum;
		
	}

}
