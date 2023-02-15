package com.example.Product1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
	
	@Autowired
	ProductRepository pr;
	
	public String post(Product p) {
		 pr.save(p);
		 return "saved successfully";
	}

	public Product getPercentage(int hsn) {
		
		return pr.getPercentage(hsn);
	}

	public List<Product> getAll() {
		return pr.findAll();
	}

}
