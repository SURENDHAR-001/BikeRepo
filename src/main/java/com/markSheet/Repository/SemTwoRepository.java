package com.markSheet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.markSheet.entity.SemTwo;

public interface SemTwoRepository extends JpaRepository<SemTwo, Integer>{
	
	@Query(value= "select * from sem_two where roll_no like ?", nativeQuery = true)
	SemTwo findByRoll(int roll);
	
}
