package com.cricket.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cricket.entity.Players;

public interface PlayersRepository extends JpaRepository<Players, Integer> {

	@Query(value="select * from players where runs > ? and runs < ?",nativeQuery=true)
	List<Players> getByRunsRange(int r1, int r2);

}
