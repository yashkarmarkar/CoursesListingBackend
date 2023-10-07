package com.example.springoracle.service;


import java.util.List;

import com.example.springoracle.entity.Course;

public interface CourseService {
	 Course addCourse( Course course);
	 List<Course> getCourses();
	 void deleteCourseById(Long courseId);
}
