package com.example.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.hrms.business.abstracts.SchoolService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.School;

@RestController
@RequestMapping("api/school")
public class SchoolControllers {

	private SchoolService schoolService;
@Autowired
	public SchoolControllers(SchoolService schoolService) {
		super();
		this.schoolService = schoolService;
	}

@PostMapping("/getall")
public DataResult<List<School>> getAll(){
	
	return this.schoolService.getAll();
}
@GetMapping("/add")
public Result add(School school) {
	return this.schoolService.add(school);
	
}
@PostMapping("/SchoolEndYearDesc")
public DataResult<List<School>> findfindAllByIsGraduateTrueOrderBySchoolEndYearDesc(){
	return this.schoolService.findAllByIsGraduateTrueOrderBySchoolEndYearDesc();
}
	
}
