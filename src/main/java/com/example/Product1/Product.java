package com.example.Product1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="details")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int hsn;
	private int price;
	
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public void setHsn(int hsn) {
		this.hsn=hsn;
	}

	public void setPrice(int price) {
		this.price=price;
	}
	

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getHsn() {
		return hsn;
	}
	
	public int getPrice() {
		return price;
	}
}



