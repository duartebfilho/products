package com.dbfprojects.Products.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbfprojects.Products.dto.GameMinDTO;
import com.dbfprojects.Products.entities.Game;
import com.dbfprojects.Products.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameservice;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		
		List<Game> result = gameservice.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		// return result;
		return dto;
		// podia ser:  return result.stream().map(x -> new GameMinDTO(x)).toList();
	}

}
