package com.lucaseros.cursomcc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucaseros.cursomcc.domain.Categoria;

@Repository
public interface CategoriaRepositories extends JpaRepository<Categoria, Integer>{
	
}
