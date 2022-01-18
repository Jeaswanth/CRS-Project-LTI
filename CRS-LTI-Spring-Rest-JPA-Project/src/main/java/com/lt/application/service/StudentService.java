package com.lt.application.service;

import com.lt.application.exception.CourseNotFoundException;

/**
 * @author Shraddha,Shahul,Jeaswanth,Parag,Sayli,Shital
 * it is the interface of StudentService
 * and these methods needs to implement in another class
 */
public interface StudentService {
	public String removeCourse(String courseId) throws CourseNotFoundException;
}
