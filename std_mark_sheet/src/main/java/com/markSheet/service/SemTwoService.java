package com.markSheet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markSheet.Dao.SemTwoDao;
import com.markSheet.entity.SemTwo;

@Service
public class SemTwoService {
	
	@Autowired
	SemTwoDao sd;
	
	public String postAll(List<SemTwo> s) {
		List<SemTwo> x = s;
		x.forEach(y-> {
			y.setTotal(y.getTheory()+y.getPracticals());
		});
		return sd.postAll(x);
	}

	public List<SemTwo> getAll() {
		return sd.getAll();
	}

	public SemTwo getByRoll(int roll) {
		return sd.getByRoll(roll);
	}

}
