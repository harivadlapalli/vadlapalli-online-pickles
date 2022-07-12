package com.vadlapalli.onlinepickles.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
		
	}
	@GetMapping("/product/{id}")
	public Optional<Product> getProducts(@PathVariable long id) {
		return productService.getProduct(id);
		
	}
	
	@PutMapping("update/{id}")
	public void updateProduct(@RequestBody Product product,@PathVariable  long id){
		productService.updateProduct(id,product);
		
	}
	@DeleteMapping("/delete/{id}")
	public void deleteProduct(@PathVariable long id){
		productService.deleteProduct(id);
		
	}

}
