package com.itv.ITVWeekendSpringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itv.ITVWeekendSpringboot.entity.Student;
import com.itv.ITVWeekendSpringboot.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	public Student saveStudent(Student s1) {
		
		return studentRepository.save(s1);	
	}

}
