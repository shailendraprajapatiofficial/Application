package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.StudentInfoDTO;

import com.example.model.Student;
import com.example.service.CollegeService;
import com.example.service.StudentInfoService;
import com.example.service.StudentService;

@RestController

public class StudentController {

	@Autowired
	CollegeService collegeService;
	@Autowired
	StudentService studentService;
	@Autowired
	StudentInfoService studentInfoService;
	
//Locally Handle The Exception For addStudent
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {
		String getStudentName = student.getStudentName();
		if(getStudentName.length()==0) throw new RuntimeException("Enter The college Name");
		return studentService.addStudent(student);

	}
	
	@ExceptionHandler(RuntimeException.class)
	public String handleStudentNameNotFoundException(RuntimeException ex) {
		return ex.getMessage();
	}

	@GetMapping("/getStudent")
	public  ResponseEntity<List<Student>> getStudent() {
		return new ResponseEntity<List<Student>>(studentService.getallStudent(), HttpStatus.FOUND);
		
	}

	@GetMapping("/getStudentInfo")
	public List<StudentInfoDTO> getStudentInfo() {
		return studentInfoService.getStudentInfo();
	}
}
