package com.joaovitor.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaovitor.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
