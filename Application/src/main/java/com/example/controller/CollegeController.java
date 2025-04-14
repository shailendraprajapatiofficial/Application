package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.StudentInfoDTO;
import com.example.model.College;
import com.example.model.Student;
import com.example.service.CollegeService;
import com.example.service.StudentInfoService;
import com.example.service.StudentService;

@RestController
public class CollegeController {

	@Autowired
	CollegeService collegeService;
	@Autowired
	StudentService studentService;

	@Autowired
	StudentInfoService studentInfoService;

	@GetMapping("/")
	public String helloworld() {
		return "Hello World";
	}

	@GetMapping("/add/{A}/{B}")
	public int add(@PathVariable int A, @PathVariable int B) {
		System.out.println(A + "============================= " + B);
		return A + B;
	}

	@PostMapping("/addCollege")
	public College addCollege(@RequestBody College college) {

		return collegeService.addCollege(college);

	}

	@GetMapping("/getCollege/{id}")
	public Optional<College> getCollegeByID(@PathVariable int id) {
		return collegeService.getcollegeById(id);

	}

	@GetMapping("/getCollege")
	public List<College> getCollege() {
		return collegeService.getCollege();
	}

}
