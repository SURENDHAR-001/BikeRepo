package com.ExceptionPractice.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ExceptionPractice.Entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer>{

	@Query(value="select * from movie_details where released_year = ?", nativeQuery=true) 
	public List<Movie> getMovieByYear(int year);

	

}
