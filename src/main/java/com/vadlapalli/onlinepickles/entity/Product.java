package com.vadlapalli.onlinepickles.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="products")
public class Product extends AbstractEntity {
	private String name;
	private String price;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Order order;
}
