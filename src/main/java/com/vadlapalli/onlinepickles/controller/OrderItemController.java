package com.vadlapalli.onlinepickles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vadlapalli.onlinepickles.entity.OrderItem;
import com.vadlapalli.onlinepickles.service.OrderItemService;

@RestController
@RequestMapping(name="/api/v1/orderitems")
public class OrderItemController {
	
	@Autowired
	private OrderItemService oderItemService;
	
	@PostMapping("/save")
	public void saveOrderItem(@RequestBody OrderItem orderItem) {
		oderItemService.saveOrderItem(orderItem);
		
	}
	@GetMapping("/")
	public List<OrderItem> getAllOrderItems(){
		return oderItemService.getAllOrderItems();
		
	}

}

