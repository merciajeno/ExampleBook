package com.in28minutes.bookstore.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.in28minutes.bookstore.entities.Author;
import com.in28minutes.bookstore.entities.Book;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class BookRepository {
	
	@Autowired
	private EntityManager em;
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public void findBooks(int id)
	{
		Author author = em.find(Author.class, id);
		List<Book> books =author.getBooks();
		
		logger.info("Books->{}",books.toString());
	}
	
	public void addBookForAuthor(int id,Book book)
	{
		Author author = em.find(Author.class, id);
		author.addBooks(book);
		book.setAuthor(author);
		em.persist(book);
	}
	
	public void addBookToTheRepo(Book book)
	{
		em.persist(book);
	}

}
