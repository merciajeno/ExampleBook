package com.in28minutes.bookstore.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.transaction.Transactional;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	private int id;
	
	private String customer_name;

	public Customer(String customer_name) {
		super();
		this.customer_name = customer_name;
	}

	public Customer() {
		super();
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public int getId() {
		return id;
	}
	
	
}
