package com.ExceptionPractice.Dao;

import java.rmi.NoSuchObjectException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ExceptionPractice.CustomException.ObjectNotFoundException;
import com.ExceptionPractice.Entity.Movie;
import com.ExceptionPractice.Repository.MovieRepository;

@Repository
public class MovieDao {
	
	@Autowired
	MovieRepository mr;

	public String  postAll(List<Movie> m) {
		mr.saveAll(m);
		return "Saved";
		
	}

	public List<Movie> getAll() {
		return mr.findAll();
	}

	public String post(Movie m) {
		mr.save(m);
		return "Saved";
	}
	
	public List<Movie> getMovieByYear(int year)  {
		
		
		return mr.getMovieByYear(year);
	}

	public Movie getById(int id) throws NoSuchObjectException, ObjectNotFoundException {
		return mr.findById(id).orElseThrow(()-> new ObjectNotFoundException());
	}

	
}
