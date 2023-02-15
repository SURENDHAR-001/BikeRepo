package com.ExceptionPractice.Service;

import java.rmi.NoSuchObjectException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ExceptionPractice.CustomException.ObjectNotFoundException;
import com.ExceptionPractice.CustomException.YearException;
import com.ExceptionPractice.Dao.MovieDao;
import com.ExceptionPractice.Entity.Movie;



@Service
public class MovieSerivce {
	
	@Autowired
	MovieDao md;
	
	public String postAll(List<Movie> m) {
		return md.postAll(m);
		
	}

	public List<Movie> getAll() {
		return md.getAll();
	}
	

	public String post(Movie m) throws YearException {
		try {
		if(m.getReleasedYear()>=2022) {
			throw new YearException("you are entering the upcomming years");
		}
		else {
			return md.post(m);
		}
		}catch(YearException ye) {
			return "you are entering the upcomming years";
		}
	}

	public List<Movie> getMovieByYear(int year)  {
		return md.getMovieByYear(year);
	}

	public Movie getById(int id) throws ObjectNotFoundException, NoSuchObjectException {
		return md.getById(id);
	}

	public List<Movie> getByName(String name) throws ObjectNotFoundException {
		
		List<Movie> x = new ArrayList<>();
		
		for(Movie m : getAll()) {
			if(name.equalsIgnoreCase(m.getName())) {
				x.add(m);
			}
		}
		
		if(x.isEmpty()) {
			throw new ObjectNotFoundException();
		}
		else {
			return x;
		}
		 
	}
}
