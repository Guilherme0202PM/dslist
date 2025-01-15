package com.dev.dslist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.dev.dslist.entities.Game;


public interface GameRepository extends JpaRepository<Game, Long>{

}