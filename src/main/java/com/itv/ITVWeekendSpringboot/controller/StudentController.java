package com.itv.ITVWeekendSpringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itv.ITVWeekendSpringboot.entity.Student;
import com.itv.ITVWeekendSpringboot.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping("/saveStudent")
	public String saveStudent() {
		Student s1 = new Student();
		s1.setAge(21);
		s1.setEmail("alice@itv.com");
		s1.setFirstName("Alice");
		s1.setGender("female");
		s1.setLastName("Fernandes");
		s1.setPercentage(78.5);
		s1.setRno(101);

		try {
			studentService.saveStudent(s1);
			return "Record Added Successfully";
		} catch (Exception e) {
			return "Error adding record: " + e.getMessage();
		}
	}

	@PostMapping("/saveStudentByRequestParam")
	public String saveStudentByRequestParam(@RequestParam("a") int age, @RequestParam("b") String em,
			@RequestParam("c") String fn, @RequestParam("d") String gn, @RequestParam("e") String ln,
			@RequestParam("f") double per, @RequestParam("g") int rn) {
		Student s1 = new Student();
		s1.setAge(age);
		s1.setEmail(em);
		s1.setFirstName(fn);
		s1.setGender(gn);
		s1.setLastName(ln);
		s1.setPercentage(per);
		s1.setRno(rn);

		try {
			studentService.saveStudent(s1);
			return "Record Added Successfully";
		} catch (Exception e) {
			return "Error adding record: " + e.getMessage();
		}

	}
	
	@PostMapping("/saveStudentByPathVariable/{a}/{b}/{c}/{d}/{e}/{f}/{g}")
	public ResponseEntity<?> saveStudentByPathVariable(@PathVariable("a") int age, @PathVariable("b") String em,
			@PathVariable("c") String fn, @PathVariable("d") String gn, @PathVariable("e") String ln,
			@PathVariable("f") double per, @PathVariable("g") int rn) {
		Student s1 = new Student();
		s1.setAge(age);
		s1.setEmail(em);
		s1.setFirstName(fn);
		s1.setGender(gn);
		s1.setLastName(ln);
		s1.setPercentage(per);
		s1.setRno(rn);

		try {
			return new ResponseEntity<Student>(studentService.saveStudent(s1),HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<String>("Error adding record: " + e.getMessage(),HttpStatus.BAD_REQUEST);
		}

	}
	
	@PostMapping("/saveStudentByRequestBody")
	public ResponseEntity<?> saveStudentByRequestBody(@RequestBody Student s1) {
		try {
			return new ResponseEntity<Student>(studentService.saveStudent(s1),HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<String>("Error adding record: " + e.getMessage(),HttpStatus.BAD_REQUEST);
		}

	}
}
