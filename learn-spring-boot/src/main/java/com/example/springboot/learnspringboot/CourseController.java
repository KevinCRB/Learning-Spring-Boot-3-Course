package com.example.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1,"Learn AWS","abc"),
				new Course(2,"Lear deveOps","qwe"),
				new Course(3,"Learn Azure","abc"),
				new Course(4,"Learn Ds","absa")
				);
	}
}
