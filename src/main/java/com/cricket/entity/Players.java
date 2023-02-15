package com.cricket.entity;

import java.util.ArrayList;
import java.util.List;

import com.cricket.repository.PlayerInterface;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.function.Predicate;

@Entity
@Table(name="players")
public class Players {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int jerseyNumber;
	private String name;
	private String teamName;
	private int age;
	private long runs;
	private String roll;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getJerseyNumber() {
		return jerseyNumber;
	}
	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getRuns() {
		return runs;
	}
	public void setRuns(long runs) {
		this.runs = runs;
	}

	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	
	
	
	
	

//	public List<Players> getPlayers(List<Players> players, Predicate<Players> predicatePlayers) {
//		List<Players> names = new ArrayList<>();
//		for(Players p: players) {
//			if(predicatePlayers.test(p)) {
//				names.add(p);
//			}
//		}
//		return names;
//	}
	
}
