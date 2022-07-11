package com.vadlapalli.onlinepickles.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Product extends AbstractEntity {
	private String name;
	private String price;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Order order;
}
