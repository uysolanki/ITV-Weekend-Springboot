package com.itv.ITVWeekendSpringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
	public void deleteStudent(int rno) {
		studentRepository.deleteById(rno);
	}
	public List<Student> saveAllStudents(List<Student> students) {
		return studentRepository.saveAll(students);
	}
	public Student updateStudent(int rno, Student newDetails) {
			Student studFromDb=student(rno);
			studFromDb.setAge(newDetails.getAge());
			studFromDb.setDob(newDetails.getDob());
			studFromDb.setEmail(newDetails.getEmail());
			studFromDb.setFirstName(newDetails.getFirstName());
			studFromDb.setGender(newDetails.getGender());
			studFromDb.setLastName(newDetails.getLastName());
			studFromDb.setPercentage(newDetails.getPercentage());
			return saveStudent(studFromDb);
			
	}
	public Page<Student> studentsPagination(int pageNumber, int pageSize) {
		return studentRepository.findAll(PageRequest.of(pageNumber, pageSize));
	}

}
