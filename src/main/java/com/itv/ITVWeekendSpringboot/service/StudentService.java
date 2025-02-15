package com.itv.ITVWeekendSpringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
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
	public List<Student> students() {
		return studentRepository.findAll();
	}
	public List<Student> sortedstudents(String field) {
		return studentRepository.findAll(Sort.by(Sort.Direction.DESC,field));
	}
	public Student student(int rno) {
		return studentRepository.findById(rno).get();
	}

}
