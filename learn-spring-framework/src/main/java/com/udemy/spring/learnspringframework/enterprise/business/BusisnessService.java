package com.udemy.spring.learnspringframework.enterprise.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.udemy.spring.learnspringframework.enterprise.data.DataService;

@Component
public class BusisnessService {
	
	//@Autowired
	private DataService dataService;
	
	public DataService getDataService() {
		return dataService;
	}
	
	
	@Autowired
	public BusisnessService(DataService dataService) {
		super();
		System.out.println("Constructor");
		this.dataService = dataService;
	}



//	@Autowired
//	public void setDataService(DataService dataService) {
//		System.out.println("Setter injection");
//		this.dataService = dataService;
//	}

	public long calculateSum() {
		List<Integer> data = dataService.getData();
		return data.stream().reduce(Integer::sum).get();
		
	}
}
