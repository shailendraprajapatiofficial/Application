package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.model.College;

public interface CollegeService {
	
	public College addCollege(College college);
	public Optional<College> getCollege(int id);

}
