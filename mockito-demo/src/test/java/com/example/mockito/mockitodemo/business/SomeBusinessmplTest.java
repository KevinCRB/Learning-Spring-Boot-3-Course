package com.example.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessmplTestStub {

	@Test
	void findTheGreatestFromAllData_basicScenario() {
		DataSeviceStub dataServiceStub = new DataSeviceStub();
		SomeBusinessmpl businessImpl= new SomeBusinessmpl(dataServiceStub);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(53,result);
	}

}

class DataSeviceStub implements DataService{

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[]{24,53,12};
	}
	
}
