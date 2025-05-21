package com.agrellodev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agrellodev.dslist.entities.Game;

public interface GameRepository extends JpaRepository <Game, Long> {

}
