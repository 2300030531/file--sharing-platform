package com.klef.fsd.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.klef.fsd.exam.model.Farmer;
import com.klef.fsd.exam.service.FarmerService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/farmer")
public class FarmerController {
	@Autowired
	private FarmerService service;
	
	@GetMapping("/")
	public String home() {
		return "Spring Boot Rest JPA Exam - Farmer";
	}
	
	@GetMapping("/viewall")
	public List<Farmer> viewallfarmers(){
		return service.viewallfarmers();
	}
	
	@PostMapping("/add")
	public String addfarmer(@RequestBody Farmer f) {
		return service.addfarmer(f);
	}
	
	@DeleteMapping("/delete/{fid}")
	public String deletefarmer(@PathVariable int fid) {
		return service.deletefarmer(fid);
	}
	
	@DeleteMapping("/delete1")
	public String deletefarmer1(@RequestParam int fid) {
		return service.deletefarmer(fid);
	}
}
