package com.joaovitor.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaovitor.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
