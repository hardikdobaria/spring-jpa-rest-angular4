package com.boot.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.model.Bike;
import com.boot.repository.BikeRepository;

@Service
public class BikeService {

	private static final Logger log = Logger.getLogger(BikeService.class);
	
	 @Autowired
	 private BikeRepository bikeRepository;

	public List<Bike> getDetailsofBike() {
		// TODO Auto-generated method stub
		List<Bike> bikes= bikeRepository.findAll();
		return bikes;
	}

	public boolean createBike(Bike bike) {
		// TODO Auto-generated method stub
		bikeRepository.saveAndFlush(bike);
		System.out.println("###Bike Created"+bike.toString());
		return true;
	}

	public boolean removeBike(Integer id) {
		// TODO Auto-generated method stub
		bikeRepository.delete(id);
		return true;
	}

	public Bike getBikeByID(Integer id) {
		// TODO Auto-generated method stub
		Bike b=bikeRepository.findOne(id);
		return b;
	}

	public boolean updateBike(Bike bike) {
		// TODO Auto-generated method stub
		bikeRepository.saveAndFlush(bike);
		return true;
	}
}
