package com.markSheet.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.markSheet.entity.SemOne;

public interface SemOneRepository extends JpaRepository<SemOne, Integer>{
	
	@Query(value="select * from sem_one where roll_no like ?", nativeQuery = true)
	SemOne findByRoll(int roll);

	

}
