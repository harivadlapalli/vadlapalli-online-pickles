package com.vadlapalli.onlinepickles.service;

import java.util.List;

import com.vadlapalli.onlinepickles.entity.OrderItem;

public interface OrderItemService {

	void saveOrderItem(OrderItem orderItem);

	List<OrderItem> getAllOrderItems();

}
