package com.msa.College.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msa.College.entity.College;
import com.msa.College.service.CollegeService;

@RestController
@RequestMapping("/college")
public class CollegeController {
	
	@Autowired
	public CollegeService collegeService;
	
	@PostMapping("/add")
	public College saveCollege(@RequestBody College college) {
		return collegeService.saveCollege(college);
	}
	
	@GetMapping("/{id}")
	public College findCollegeById(@PathVariable("id") Long collegeId) {
		return collegeService.findCollegeById(collegeId);
	}
	
	
	
	
	
	
	
	
	

}
