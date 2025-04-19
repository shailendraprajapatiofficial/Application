package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.StudentInfoDTO;
import com.example.exception.ResourceNotFoundException;
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
		System.out.println("Ahsan Pushed code");
		return "Hello World";
	}

	@GetMapping("/add/{A}/{B}")
	public int add(@PathVariable int A, @PathVariable int B) {
		System.out.println(A + "============================= " + B);
		return A + B;
	}

	@PostMapping("/addCollege")
	public ResponseEntity<College> addCollege(@RequestBody College college) throws ResourceNotFoundException {
		
		String getcollegeName = college.getcollegeName();
		if(getcollegeName.length()==0) throw new ResourceNotFoundException("Enter The college Name");

		return new ResponseEntity<College>(collegeService.addCollege(college), HttpStatus.CREATED) ;

	}
	

	@GetMapping("/getCollege/{id}")
	public ResponseEntity<Optional<College>> getCollegeByID(@PathVariable int id) throws ResourceNotFoundException  {
		Optional<College> lists = collegeService.getcollegeById(id);
		if(lists.isEmpty()) throw new ResourceNotFoundException("There is no record with ID "+id);
		
		return new ResponseEntity<Optional<College>>(collegeService.getcollegeById(id), HttpStatus.FOUND);

	}

	@GetMapping("/getCollege")
	public List<College> getCollege() {
		return collegeService.getCollege();
	}
	
	@DeleteMapping("/deleteByID")
	public ResponseEntity<String> deleteByID(@PathVariable int id){
		collegeService.deleteCollgeByID(id);
		return new ResponseEntity<String>("Deleted", HttpStatus.NOT_FOUND);
		
		
	}

}
