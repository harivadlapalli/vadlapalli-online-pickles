package com.vadlapalli.onlinepickles.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class AbstractEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	public Long id;
	public String updatedBy;
	public String updatedDate;
	public String createdBy;
	public String createdDate;
	
}
