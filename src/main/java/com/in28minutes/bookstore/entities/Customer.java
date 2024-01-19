package com.in28minutes.bookstore.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;


@Entity
public class Customer {

	@Id
	@GeneratedValue
	private int id;
	
	private String customer_name;
	
	@ManyToMany(mappedBy = "customers")
	private List<Book> books;

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

	@Override
	public String toString() {
		return "Customer [customer_name=" + customer_name + "]";
	}
	
	public void addBook(Book book)
	{
		this.books.add(book);
	}
	
	public void removeBook(Book book)
	{
		if(this.books.contains(book))
			this.books.remove(book);
		else
			System.out.println("This book is not available here!!");
	}

	public List<Book> getBooks() {
		return books;
	}
	
	
	
}
