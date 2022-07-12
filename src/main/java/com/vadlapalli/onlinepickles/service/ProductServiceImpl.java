package com.vadlapalli.onlinepickles.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vadlapalli.onlinepickles.entity.Product;
import com.vadlapalli.onlinepickles.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void saveProduct(Product product) {
		productRepository.save(product);
		
	}

	@Override
	public List<Product> getAllProducts() {
		productRepository.findAll().forEach(products :: add);
		return products;
		}


	@Override
	public void updateProduct(long id, Product product) {
		productRepository.save(product);
		
	}

	@Override
	public void deleteProduct(long id) {
		productRepository.deleteById(id);
		
	}

	@Override
	public Optional<Product> getProduct(long id) {
		return productRepository.findById(id);
	}
	}

