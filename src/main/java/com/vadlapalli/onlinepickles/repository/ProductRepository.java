package com.vadlapalli.onlinepickles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vadlapalli.onlinepickles.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
