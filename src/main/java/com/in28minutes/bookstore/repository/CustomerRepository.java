package com.in28minutes.bookstore.repository;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.in28minutes.bookstore.entities.Book;
import com.in28minutes.bookstore.entities.Customer;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CustomerRepository {

	@Autowired
	EntityManager em;
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public void getBookForCustomer(int id)
	{
		Customer customer = em.find(Customer.class, id);
		List<Book> books = customer.getBooks();
		logger.info("customer->{} books->{}",customer,books);
	}
	
	public void AddCustomerForBook(Book book,int id)
	{
		Customer customer = em.find(Customer.class, id);
		System.out.println(customer);
		customer.addBook(book);
	    book.addCustomer(customer);
		em.merge(book);
		
	}
	
	public void addCustomerToRepo(Customer customer)
	{
		em.persist(customer);
	}
}
