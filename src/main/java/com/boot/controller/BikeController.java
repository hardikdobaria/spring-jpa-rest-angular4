package com.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.boot.model.Bike;
import com.boot.service.BikeService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
public class BikeController {
	
	@Autowired
	private BikeService bikeService;
	
	 @RequestMapping("/")
	 public String start() {
	        return "Spring Boot start working!";
	    }

	// Get list of all Bikes
	@RequestMapping("/api/allBikes")
	public ResponseEntity<List<Bike>> getAllBikes() {
		List<Bike> bikeslist=bikeService.getDetailsofBike();
		return new ResponseEntity<List<Bike>>(bikeslist, HttpStatus.OK);
	}
	
	// Create Bike
	@RequestMapping(value = "/api/bike", method = RequestMethod.POST)
	public ResponseEntity<Void> createBike(@RequestBody Bike bike, UriComponentsBuilder builder) {
		boolean flag = bikeService.createBike(bike);
		if (flag == false) {
		     return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/bike?id={id}").buildAndExpand(bike.getId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	
	// Delete Bike
	@RequestMapping(value = "/api/bike", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteBike(@RequestParam("id") Integer id) {
		boolean flag = bikeService.removeBike(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	// Get Bike by ID
	@RequestMapping(value = "/api/bike", method = RequestMethod.GET)
	public ResponseEntity<Bike> getBikeById(@RequestParam("id") Integer id) {
		Bike bike = bikeService.getBikeByID(id);
		return new ResponseEntity<Bike>(bike, HttpStatus.OK);
	}
	
	// Update Bike
	@RequestMapping(value = "/api/bike", method = RequestMethod.PUT)
	public ResponseEntity<Bike>  updateBike(@RequestBody Bike bike) {
		boolean flag = bikeService.updateBike(bike);
		return new ResponseEntity<Bike>(bike, HttpStatus.OK);
	}
	
	
}
