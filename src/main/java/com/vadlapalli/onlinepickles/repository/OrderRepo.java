package com.vadlapalli.onlinepickles.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vadlapalli.onlinepickles.entity.Order;

public interface OrderRepo extends JpaRepository<Order, Long>{

}
