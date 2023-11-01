package com.example.mockito.mockitodemo.business;

public class SomeBusinessmpl {
	
	private DataService dataservice;
	
	public SomeBusinessmpl(DataService dataservice) {
		super();
		this.dataservice = dataservice;
	}



	public int findTheGreatestFromAllData() {
		int[] data = dataservice.retrieveAllData();
		int greatestValue=Integer.MIN_VALUE;
		for(int value:data) {
			if(value>greatestValue) {
				greatestValue=value	;
			}
		}
		return greatestValue;
	}
}

interface DataService{
	int[] retrieveAllData();
}