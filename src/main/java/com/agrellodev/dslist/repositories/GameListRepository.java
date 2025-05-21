package com.agrellodev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agrellodev.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository <GameList, Long> {

}
