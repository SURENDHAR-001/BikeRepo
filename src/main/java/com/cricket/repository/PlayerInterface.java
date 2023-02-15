package com.cricket.repository;

import java.util.List;
import java.util.function.Predicate;

import com.cricket.entity.Players;

public interface PlayerInterface {
	public List<Players> getPlayers(List<Players> players, Predicate<Players> predicatePlayers );
}
