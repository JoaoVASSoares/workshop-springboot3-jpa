package com.joaovitor.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaovitor.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
