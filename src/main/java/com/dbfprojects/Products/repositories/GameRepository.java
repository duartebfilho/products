package com.dbfprojects.Products.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbfprojects.Products.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
