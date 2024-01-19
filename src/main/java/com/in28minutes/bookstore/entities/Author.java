package com.in28minutes.bookstore.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Author {

	@Id
	@GeneratedValue
	private int id;
	
	private String author_name;
	
	@OneToMany(mappedBy = "author")
	private List<Book> books = new ArrayList<>();

	public Author() {
		super();
	}

	public Author(String author_name) {
		super();
		this.author_name = author_name;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public int getId() {
		return id;
	}
	
	public void addBooks(Book book)
	{
		this.books.add(book);
	}
	
	public void removeBooks(Book book)
	{
		this.books.remove(book);
	}

	public List<Book> getBooks() {
		return books;
	}

	@Override
	public String toString() {
		return "Author [author_name=" + author_name + "]";
	}
	
	
	
}
