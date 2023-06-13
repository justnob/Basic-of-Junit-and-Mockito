package com.amar.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SomeBusinessImplStubTest {

	 
	
	@Test
	void findTheGreatest_basic() {
		DataServicestub dataServicestub = new DataServicestub();
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServicestub);
		
		int greatest = someBusinessImpl.findTheGreatest();
		
		assertEquals(9999, greatest);
		
	}
}

class DataServicestub implements DataService{

	@Override
	public int[] retriveAllData() {
		return new int[] {25,50,55,44,43,67,87,45,90,23,45,67,89,222,78,777,9999};
	}
	
	
	
}
