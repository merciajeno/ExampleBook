package com.in28minutes.bookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.bookstore.entities.Book;
import com.in28minutes.bookstore.repository.BookRepository;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner{
	
	@Autowired
	BookRepository bookRepo;

	public static void main(String[] args)  {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Book book  = new Book("Hello World");
		bookRepo.addBookForAuthor(20001, book);
		bookRepo.findBooks(20001);

	}

}
