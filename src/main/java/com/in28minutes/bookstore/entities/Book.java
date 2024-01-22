package com.in28minutes.bookstore.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Book {

	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
    @ManyToOne
	private Author author;
    
    @ManyToMany
    private List<Customer> customers = new ArrayList<>();

	public Book() {
		super();
	}

	public Book(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + "]";
	}

	
	public void addCustomer(Customer customer)
	{
		this.customers.add(customer);
	}
	
	public void removeCustomer(Customer customer)
	{
		this.customers.remove(customer);
	}

	public List<Customer> getCustomers() {
		return customers;
	}
	
	
	
}
