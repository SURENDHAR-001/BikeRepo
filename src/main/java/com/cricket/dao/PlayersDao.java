package com.cricket.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cricket.entity.Players;
import com.cricket.repository.PlayersRepository;

@Repository
public class PlayersDao {

	@Autowired
	PlayersRepository pr;
	
	public String setPlayers(Players p) {
		pr.save(p);
		return "Saved";
	}

	public String setAllPlayers(List<Players> p) {
		pr.saveAll(p);
		return "Saved";
	}

	public List<Players> getAllPlayers() {
		return pr.findAll();
	}

	public Players getPlayerById(int id) {
		return pr.findById(id).get();
	}

	public List<Players> getByRunsRange(int r1, int r2) {
		return pr.getByRunsRange(r1,r2);
	}


	

}
