package com.cricket.service;

import java.util.Comparator;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.dao.PlayersDao;
import com.cricket.entity.Players;

@Service
public class PlayersService {
	
	@Autowired
	PlayersDao pd;
	
	
	Players p  = new Players();
	
	public String setPlayers(Players p) {
		return setPlayers(p);
	}

	public String setAllPlayers(List<Players> p) {
		return pd.setAllPlayers(p);
	}

	public List<Players> getAllPlayers() {
		return pd.getAllPlayers();
	}

	public Players getPlayerById(int id) {
		return pd.getPlayerById(id);
	}

	// || x.getJerseyNumber()==Integer.parseInt(n) || x.getId()==Integer.parseInt(n)

	public List<Players> getPlayer(String n) {
		return p.getPlayers(getAllPlayers(), x->  x.getName().contains(n));
	}

	public Players getTopScorer() {
		return getAllPlayers().stream().max(Comparator.comparing(Players :: getRuns)).get();
	}

	public String getLowScorer() {
		return getAllPlayers().stream().min(Comparator.comparing(Players :: getRuns)).map(x->x.getName()).get();
	}

	public List<Players> getByRunsRange(int r1, int r2) {
		return pd.getByRunsRange(r1,r2);
	}

}
