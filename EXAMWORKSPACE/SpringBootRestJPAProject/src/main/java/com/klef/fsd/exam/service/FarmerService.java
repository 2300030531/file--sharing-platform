package com.klef.fsd.exam.service;

import java.util.List;

import com.klef.fsd.exam.model.Farmer;

public interface FarmerService {
	public String addfarmer(Farmer f);
	public String deletefarmer(int fid);
	public List<Farmer> viewallfarmers();
}
