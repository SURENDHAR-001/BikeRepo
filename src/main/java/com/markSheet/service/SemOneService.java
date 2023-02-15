package com.markSheet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markSheet.Dao.SemOneDao;
import com.markSheet.entity.SemOne;

@Service
public class SemOneService {
	
	@Autowired
	SemOneDao sd;

	public String postAll(List<SemOne> s) {
		List<SemOne> x = s;
		x.forEach(y-> {
			y.setTotal(y.getTheory()+y.getPracticals());
		});
		return sd.postAll(x);
	}

	public List<SemOne> getAll() {
		return sd.getAll();
	}

	public SemOne getByRoll(int roll) {
		return sd.getByRoll(roll);
	}
	

}
