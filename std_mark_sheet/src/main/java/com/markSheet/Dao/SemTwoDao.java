package com.markSheet.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.markSheet.Repository.SemTwoRepository;
import com.markSheet.entity.SemTwo;

@Repository
public class SemTwoDao {
	
	@Autowired
	SemTwoRepository sr;
	
	public String postAll(List<SemTwo> s) {
		sr.saveAll(s);
		return "Saved";
	}

	public List<SemTwo> getAll() {
		return sr.findAll();
	
	}

	public SemTwo getByRoll(int roll) {
		return sr.findByRoll(roll);
	}
}
