package com.example.springoracle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springoracle.entity.Course;
import com.example.springoracle.service.CourseService;
@CrossOrigin(origins = {"http://localhost:3000/"})
@RestController
public class MyController {
	@Autowired
	private CourseService courseService;
	@PostMapping ("/courses/add")
	public Course addCourse(@RequestBody Course course) {
		return courseService.addCourse(course);
	}
	
	@GetMapping ("/courses")
	public List<Course> getCourse() {
		return (List<Course>)courseService.getCourses();
	}
	
	@DeleteMapping ("/courses/{courseId}")
	public String deleteCourseById(@PathVariable long courseId) {
		courseService.deleteCourseById(courseId);
		return "Course Deleted u sucessfully";
	}
	
	
}
