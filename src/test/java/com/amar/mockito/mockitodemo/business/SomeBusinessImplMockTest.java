package com.amar.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {

	 
	
	@Test
	void findTheGreatest_basic() {
		
		DataService dataServiceMock = mock(DataService.class);
		
		//dataServiceMock.retriveAllData() => new int[] {25,50,55,44,43,67,87,45,90,23,45,67,89,222,78,777,9999}
		
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {25,50,55,44,43,67,87,45,90,23,45,67,89,222,78,777,9999});
		
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
		
		int greatest = someBusinessImpl.findTheGreatest();
		
		assertEquals(9999, greatest);
		
	}
	
	@Mock
	private DataService dataServiceMock2;
	
	@InjectMocks
	private SomeBusinessImpl someBusinessImpl2;
	
	
	@Test
	void findTheGreatest_basic_simple() {
		
		
		
		//dataServiceMock.retriveAllData() => new int[] {25,50,55,44,43,67,87,45,90,23,45,67,89,222,78,777,9999}
		
		when(dataServiceMock2.retriveAllData()).thenReturn(new int[] {55,77,8,44,2,44,5,6,88});
		
		int greatest = someBusinessImpl2.findTheGreatest();
		
		assertEquals(88, greatest);
	
	}	
}
