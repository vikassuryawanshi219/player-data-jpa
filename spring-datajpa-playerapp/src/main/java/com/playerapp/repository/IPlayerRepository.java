package com.playerapp.repository;

import java.util.List;

import com.playerapp.model.Player;

public interface IPlayerRepository {

	
//Derived Queries
	
	List<Player> findByCountry(String contry);
	
	List<Player> getByposition(String position);
	
	List<Player> findByClubName(String clubName);
	
	List<Player> findByHead(String head);
	
	List<Player> findByCountryAndHead(String country,String head);
	
	List<Player> findByClubNameAndHead(String clubName,String head);
}
