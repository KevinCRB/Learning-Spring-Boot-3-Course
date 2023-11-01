package com.example.springBoot.LearnJPAHibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springBoot.LearnJPAHibernate.course.Course;

public interface CourseSpringDataJPARepository extends JpaRepository<Course, Long> {
	List<Course> findByAuthor(String author);
	List<Course> findByName(String name);
}
