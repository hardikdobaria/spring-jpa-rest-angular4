package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.model.Bike;

public interface BikeRepository  extends JpaRepository<Bike, Integer> {

	
}
