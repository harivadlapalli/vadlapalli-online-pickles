package com.vadlapalli.onlinepickles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vadlapalli.onlinepickles.entity.Product;
import com.vadlapalli.onlinepickles.service.ProductService;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	
	@PostMapping("/save")
	public void saveProduct(@RequestBody Product product) {
		productService.saveProduct(product);
	}
	
	@GetMapping("/Allproducts")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
		
	}

}
