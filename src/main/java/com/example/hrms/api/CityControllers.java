package com.example.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.CityService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.City;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/city")
public class CityControllers  {

	private CityService cityService;
@Autowired
	public CityControllers(CityService cityService) {
		super();
		this.cityService = cityService;
	}
	
@GetMapping("/getall")
public DataResult<List<City>> getAll(){
	return this.cityService.getAll();
}

@PostMapping("/add")
public Result add(@RequestBody City city) {
	return this.cityService.add(city);
}
	
}
