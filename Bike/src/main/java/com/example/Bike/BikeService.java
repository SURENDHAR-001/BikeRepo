package com.example.Bike;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BikeService {
	@Autowired
	BikeDao bikeDao;

	public String addDetails (Bikes bike) {
		return bikeDao.addDetails(bike);
	}
	
	public String addAllDetails(List<Bikes> bikes) {
		return bikeDao.addAllDetails(bikes);
	}
	
	public Bikes getDetails(int id) {
		return bikeDao.getDetails(id);
	}
	
		public List<Bikes> getAllDetails(){
			return bikeDao.getAllDetails();
		}
		
	public int getPrice(int id, int taxPercent) {
		 return bikeDao.getPrice(id)+(bikeDao.getPrice(id)*taxPercent/100);
	}

}
