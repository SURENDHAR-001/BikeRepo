package com.example.Product1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	ProductDao pd;

	public String post(Product p) {
		return pd.post(p);
	}

	public Product getPercentage(int hsn) {

		return pd.getPercentage(hsn);
	}

	public List<Product> getAll() {
		return pd.getAll();
	}

	
	
	
}
