package com.markSheet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.markSheet.entity.SemTwo;
import com.markSheet.service.SemTwoService;

@RestController
@RequestMapping(value="/semTwo")
public class SemTwoController {
	
	@Autowired
	SemTwoService ss;
	
	
	@PostMapping(value="/postAll")
	public String postAll(@RequestBody List<SemTwo> s) {
		return ss.postAll(s);
	}
	
	@GetMapping(value="/getAll")
	public List<SemTwo> getAll () {
		return ss.getAll();
	}
	
	@GetMapping(value="/getByRoll/{roll}")
	public SemTwo getByRoll(@PathVariable int roll) {
		return ss.getByRoll(roll);
	}
}
