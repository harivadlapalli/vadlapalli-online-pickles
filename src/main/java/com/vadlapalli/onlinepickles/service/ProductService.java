package com.vadlapalli.onlinepickles.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.vadlapalli.onlinepickles.entity.Product;


public interface ProductService {
	
	List<Product> products = new ArrayList<>();

	void saveProduct(Product product);

	List<Product> getAllProducts();

	void updateProduct(long id, Product product);

	void deleteProduct(long id);

	Optional<Product> getProduct(long id);

}
