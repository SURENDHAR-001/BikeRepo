package com.example.Product1;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product,Integer> {

	@Query(value="select * from product_details where hsn=?",nativeQuery=true)
	Product getPercentage(int hsn);

	
	
	

}
