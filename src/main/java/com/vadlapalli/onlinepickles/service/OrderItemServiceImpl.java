package com.vadlapalli.onlinepickles.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vadlapalli.onlinepickles.entity.OrderItem;
import com.vadlapalli.onlinepickles.repository.OrderItemRepo;

@Service
public class OrderItemServiceImpl implements OrderItemService {
	
	@Autowired
	private OrderItemRepo orderItemRepo;
	
	
	List<OrderItem> orderItems = new ArrayList<>();

	@Override
	public void saveOrderItem(OrderItem orderItem) {
		orderItemRepo.save(orderItem);
		
	}

	@Override
	public List<OrderItem> getAllOrderItems() {
		orderItemRepo.findAll().forEach(orderItems :: add);
		return orderItems;
	}

}
