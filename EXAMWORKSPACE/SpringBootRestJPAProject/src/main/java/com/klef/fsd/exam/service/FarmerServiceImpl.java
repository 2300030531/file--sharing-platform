package com.klef.fsd.exam.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsd.exam.model.Farmer;
import com.klef.fsd.exam.repository.FarmerRepository;

@Service
public class FarmerServiceImpl implements FarmerService{
	@Autowired
	private FarmerRepository repository;
	
	public String addfarmer(Farmer f) {
		repository.save(f);
		return ("Farmer Added Successfully");
	}
	public String deletefarmer(int fid) {
		Optional<Farmer> object=repository.findById(fid);
		String msg=null;
		if(object.isPresent()) {
			Farmer f=object.get();
			repository.delete(f);
			msg="Farmer Deleted Successfully";
		}
		else{
			msg="Farmer ID Not Found to Delete";
		}
		return msg;
	}
	public List<Farmer> viewallfarmers(){
		return repository.findAll();
	}
}
