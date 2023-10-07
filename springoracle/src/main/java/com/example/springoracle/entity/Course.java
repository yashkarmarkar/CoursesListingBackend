package com.example.springoracle.entity;

//package com.example.springoracle.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	@Column
	private String title;
	@Column
	private String description;
	@Column
	private int duration;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", description=" + description + ", duration=" + duration
				+ ", getId()=" + getId() + ", getTitle()=" + getTitle() + ", getDescription()=" + getDescription()
				+ ", getDuration()=" + getDuration() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	 public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Course(long id, String title, String description, int duration) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.duration = duration;
	}
	
}
