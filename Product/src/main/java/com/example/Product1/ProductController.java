package com.example.Product1;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@Autowired
	ProductService ps;
	
	@PostMapping(value="/post")
	public String post(@RequestBody Product p) {
		return ps.post(p);
	}
	
	@GetMapping(value="/getAll")
	public List<Product> getAll(){
		return ps.getAll();
	}
	
	@GetMapping(value="get/{hsn}")
	public Product getPercentage(@PathVariable int hsn) {
		return ps.getPercentage(hsn);
	}
	
	
	

}
