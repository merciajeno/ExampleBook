package com.in28minutes.bookstore.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CustomerRepository {

	@Autowired
	EntityManager em;
	
	
}
