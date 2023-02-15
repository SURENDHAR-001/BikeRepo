package com.markSheet.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.markSheet.Repository.SemOneRepository;
import com.markSheet.entity.SemOne;

@Repository
public class SemOneDao {
	
	@Autowired
	SemOneRepository sr;

	public String postAll(List<SemOne> s) {
		sr.saveAll(s);
		return "Saved";
	}

	public List<SemOne> getAll() {
		return sr.findAll();
	
	}

	public SemOne getByRoll(int roll) {
		return sr.findByRoll(roll);
	}
	
	
}
