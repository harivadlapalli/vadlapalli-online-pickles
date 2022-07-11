package com.vadlapalli.onlinepickles.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vadlapalli.onlinepickles.entity.Product;


public interface ProductService {
	
	List<Product> products = new ArrayList<>();

	void saveProduct(Product product);

	List<Product> getAllProducts();

}
