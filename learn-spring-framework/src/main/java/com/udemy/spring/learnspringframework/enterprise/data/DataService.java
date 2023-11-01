package com.udemy.spring.learnspringframework.enterprise.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DataService {
	
	public List<Integer> getData() {
		return Arrays.asList(12, 13, 15);
	}
}