package com.vadlapalli.onlinepickles.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vadlapalli.onlinepickles.request.OrderRequest;
import com.vadlapalli.onlinepickles.response.OrderResponseDTO;

@RestController
@RequestMapping("api/v1/order")
public class OrderController {

	@PostMapping("/save")
	public OrderResponseDTO placeOrder(@RequestBody OrderRequest orderRequest) {
		return null;
	}
}
