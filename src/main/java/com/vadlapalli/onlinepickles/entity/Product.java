package com.vadlapalli.onlinepickles.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@Builder
@ToString(callSuper = true)
@DynamicInsert
@DynamicUpdate
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class Product extends AbstractEntity {

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "price", nullable = false)
	private Double price;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name="order_id", nullable=false)
	private Order order;
}
