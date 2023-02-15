package com.example.Bike;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BikeController {
	
	@Autowired
	BikeService bikeService;

	@PostMapping(value="/add")
	public String addDetails(@RequestBody Bikes bike) {
		return bikeService.addDetails(bike);
	}
	
	@PostMapping (value="/addall")
	public String addAllDetails(@RequestBody List<Bikes> bikes) {
		return bikeService.addAllDetails(bikes);
	}
	
	@GetMapping(value="/get/{id}")
	public Bikes getDetails(@PathVariable int id) {
		return bikeService.getDetails(id);
	}
	
	@GetMapping (value="/getall")
		public List<Bikes> getAllDetails(){
			return bikeService.getAllDetails();
		}
	
	@GetMapping(value="/getGst/{id}/{taxPercent}")
	public int getTax(@PathVariable int id,@PathVariable int taxPercent) {
		return bikeService.getTax(id,taxPercent);
	}
		
	}
	

