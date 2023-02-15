package com.example.Bike;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BikeRepository extends JpaRepository<Bikes,Integer>{
	
	@Query(value="select price from bike_details where id=?",nativeQuery=true)
	public int getPrice( int id);

}
