package com.amar.mockito.mockitodemo.business;

public class SomeBusinessImpl {

	private DataService dataService;
	
	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}



	public int findTheGreatest() {
		
		int[] data = dataService.retriveAllData();
		int gratestValue = Integer.MIN_VALUE;
		
		for(int gdata:data) {
			
			if(gdata > gratestValue) {
				gratestValue = gdata;
			}
			
		}
		return gratestValue;
	}
	
}

interface DataService{
	int[] retriveAllData();
}
