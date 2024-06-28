package com.dbfprojects.Products.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbfprojects.Products.entities.Game;
import com.dbfprojects.Products.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gamerepository;
	
	public List<Game> findAll(){
		
		// var result = cria uma lista mas usaremos o padrao List
		// var result = gamerepository.findAll();
		List<Game> result = gamerepository.findAll();
		return result;

	}
}
