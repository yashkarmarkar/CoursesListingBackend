package com.example.springoracle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springoracle.entity.Course;
import com.example.springoracle.repo.CourseRepository;
@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public Course addCourse(Course course) {
		
		return courseRepository.save(course);
	}

	@Override
	public List<Course> getCourses() {
		
		return (List<Course>) courseRepository.findAll();
	}

	@Override
	public void deleteCourseById(Long courseId) {
	
		courseRepository.deleteById(courseId);
		
	}

	

}
