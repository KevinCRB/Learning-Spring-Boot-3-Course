package com.example.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessmplMockTest {
	
	@Mock
	private DataService dataServiceMock;
	
	@InjectMocks
	private SomeBusinessmpl businessImpl;
	
	@Test
	void findTheGreatestFromAllData_basicScenario() {
		//dataServiceMock.retrieveAllData() => new int[]{24,53,12};
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{24,53,12});
		assertEquals(53,businessImpl.findTheGreatestFromAllData());
	}
	@Test
	void findTheGreatestFromAllData_oneScenario() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{12});
		assertEquals(12,businessImpl.findTheGreatestFromAllData());
	}
	@Test
	void findTheGreatestFromAllData_voidScenario() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{});
		assertEquals(Integer.MIN_VALUE,businessImpl.findTheGreatestFromAllData());
	}
}

