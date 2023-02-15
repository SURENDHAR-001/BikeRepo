package com.cricket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.cricket.entity.Players;
import com.cricket.service.PlayersService;

@RestController
public class PlayersController {
	
	@Autowired
	PlayersService ps;
	
	@PostMapping("/setPlayers")
	public String setPlayers(Players p) {
		return ps.setPlayers(p);
	}
	
	@PostMapping("/setAllPlayers")
	public String setAllPlayers(@RequestBody List<Players> p) {
		return ps.setAllPlayers(p);
	}
	
	@GetMapping("/getAllPlayers")
	public List<Players> getAllPlayers(){
		return ps.getAllPlayers();
	}
	
	@GetMapping("/getPlayerById/{id}")
	public Players getPlayerById(@PathVariable int id) {
		return ps.getPlayerById(id);
	}

	
	@GetMapping("/getPlayer/{n}")
	public List<Players> getPlayer(@PathVariable String n) {
		return ps.getPlayer(n);
	}
	
	@GetMapping("/getTopScorer")
	public Players getTopScorer() {
		return ps.getTopScorer();
		
	}
	
	@GetMapping("/getLowScorer")
	public String getLowScorer() {
		return ps.getLowScorer();
	}
	
	@GetMapping("/getByRunsRange/{r1}/{r2}")
	public List<Players> getByRunsRange(@PathVariable int r1, @PathVariable int r2){
		return ps.getByRunsRange(r1,r2);
	}
	
}
