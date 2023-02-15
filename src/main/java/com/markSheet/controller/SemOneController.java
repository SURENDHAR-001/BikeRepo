package com.markSheet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.markSheet.entity.SemOne;
import com.markSheet.service.SemOneService;

@RestController
@RequestMapping(value="/semOne")
public class SemOneController {
	
	@Autowired
	SemOneService ss;
	
	@PostMapping(value="/postAll")
	public String postAll(@RequestBody List<SemOne> s) {
		return ss.postAll(s);
	}
	
	@GetMapping(value="/getAll")
	public List<SemOne> getAll () {
		return ss.getAll();
	}
	
	@GetMapping(value="/getByRoll/{roll}")
	public SemOne getByRoll(@PathVariable int roll) {
		return ss.getByRoll(roll);
	}
	
}
