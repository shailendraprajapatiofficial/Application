package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.model.College;

public interface CollegeService {
	
	 College addCollege(College college);
	 Optional<College> getcollegeById(int id);
	 List<College> getCollege();

}
