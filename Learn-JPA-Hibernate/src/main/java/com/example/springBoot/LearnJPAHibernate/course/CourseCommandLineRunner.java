package com.example.springBoot.LearnJPAHibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.springBoot.LearnJPAHibernate.course.springdatajpa.CourseSpringDataJPARepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//	@Autowired
//	private CourseJDBCRepository repository;
//	@Autowired
//	private CourseJPARepository repository;
	@Autowired
	private CourseSpringDataJPARepository repository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new Course(1,"Learn AWS JPA","IN28minutes"));
		repository.save(new Course(2,"Learn Spring JPA","IN28minutes"));
		repository.save(new Course(3,"Learn Noc JPA","IN28minutes"));
		repository.deleteById(2l);
		System.out.println(repository.findById(1l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.findByAuthor("IN28minutes"));
		System.out.println(repository.findByAuthor(" "));
		System.out.println(repository.findByName("Learn AWS JPA"));
		System.out.println(repository.findByName("Learn Spring JPA"));
	}

}
