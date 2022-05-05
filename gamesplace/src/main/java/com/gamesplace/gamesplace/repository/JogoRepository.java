package com.gamesplace.gamesplace.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gamesplace.gamesplace.model.Jogo;

@Repository
public interface JogoRepository extends JpaRepository<Jogo, Long>{
	public List<Jogo> findAllByTituloContainingIgnoreCase (String Titulo);
}
