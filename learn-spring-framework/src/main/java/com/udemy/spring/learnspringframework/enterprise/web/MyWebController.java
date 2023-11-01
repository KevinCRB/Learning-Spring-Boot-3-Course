package com.udemy.spring.learnspringframework.enterprise.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.udemy.spring.learnspringframework.enterprise.business.BusisnessService;

@Component
public class MyWebController {
	
	@Autowired
	private BusisnessService businessService;

	
	public MyWebController(BusisnessService businessService) {
		super();
		System.out.println("COnts");
		this.businessService = businessService;
	}


	public long returnValueFromBusinessService() {
		return businessService.calculateSum();
	}
}

