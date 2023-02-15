package com.ExceptionPractice.Controller;

import java.rmi.NoSuchObjectException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ExceptionPractice.CustomException.ObjectNotFoundException;
import com.ExceptionPractice.CustomException.YearException;
import com.ExceptionPractice.Entity.Movie;
import com.ExceptionPractice.Service.MovieSerivce;

@RestController
@RequestMapping(value="/practice")
public class MovieController {
	
	@Autowired
	MovieSerivce ms;
	
	@PostMapping(value="/postAll")
	public String postAll(@RequestBody List<Movie> m) {
		return ms.postAll(m);
	}
	
	@GetMapping(value="/getAll")
	public List<Movie> getAll() {
		return ms.getAll();
	}
	
	@PostMapping(value="/post")
	public String post(@RequestBody Movie m) throws YearException {
		return ms.post(m);
	}
	
	@GetMapping(value="/getMovieByYear/{year}")
	public List<Movie> getMovieByYear(@PathVariable int year) {
		return ms.getMovieByYear(year);
	}
	
	@GetMapping(value="/getById/{id}")
	public Movie getById(@PathVariable int id) throws ObjectNotFoundException, NoSuchObjectException {
		return ms.getById(id);
	}
	
	@GetMapping(value= "/getByName/{name}")
	public List<Movie> getByName(@PathVariable String name) throws ObjectNotFoundException{
		return ms.getByName(name);
		
	}
	
}
