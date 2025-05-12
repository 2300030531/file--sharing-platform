package com.klef.fsd.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.fsd.exam.model.Farmer;

public interface FarmerRepository extends JpaRepository<Farmer, Integer>{

}
