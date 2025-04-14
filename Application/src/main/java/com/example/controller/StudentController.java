package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);

	}

	@GetMapping("/getStudent")
	public List<Student> getStudent() {
		return studentService.getallStudent();
	}

	@GetMapping("/getStudentInfo")
	public List<StudentInfoDTO> getStudentInfo() {
		return studentInfoService.getStudentInfo();
	}
}
