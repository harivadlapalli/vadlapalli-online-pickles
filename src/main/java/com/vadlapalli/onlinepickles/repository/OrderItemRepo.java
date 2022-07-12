package com.vadlapalli.onlinepickles.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vadlapalli.onlinepickles.entity.OrderItem;

public interface OrderItemRepo extends JpaRepository<OrderItem, Long>{

}
