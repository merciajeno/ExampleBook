package com.in28minutes.bookstore.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.in28minutes.bookstore.entities.Author;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AuthorRepository {

	@Autowired
	EntityManager em;
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public void getBooksForAuthor(int id)
	{
		Author author = em.find(Author.class, id);
		logger.info("Author-{} Books-{}",author,author.getBooks());
	}
}
