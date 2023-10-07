package com.example.springoracle.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springoracle.entity.Course;


public interface CourseRepository extends JpaRepository<Course, Long> {

}
