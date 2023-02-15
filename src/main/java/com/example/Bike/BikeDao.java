package com.example.Bike;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BikeDao {
	
	@Autowired
	BikeRepository bikeRepo;

	public String addDetails (Bikes bike) {
		 bikeRepo.save(bike);
		 return "successfully saved";
	}
	
	public String addAllDetails(List<Bikes> bikes) {
		 bikeRepo.saveAll(bikes);
		 return "Succesfully saved all Data";
	}
	
	public Bikes getDetails(int id) {
		return bikeRepo.findById(id).get();
	}
	
		public List<Bikes> getAllDetails(){
			return bikeRepo.findAll();
		}
	
	public Bikes getTax(int id) {
		return bikeRepo.getTax(id);
	}


}
