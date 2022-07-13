package com.vadlapalli.onlinepickles.service;

import java.util.ArrayList;
import java.util.List;

import com.vadlapalli.onlinepickles.entity.OrderItem;

public interface OrderItemService {
	
	List<OrderItem> orderItems = new ArrayList<>();

	void saveOrderItem(OrderItem orderItem);

	List<OrderItem> getAllOrderItems();

}
