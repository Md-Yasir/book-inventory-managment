package com.yas.book.inventory.service;

import java.util.Optional;

import com.yas.book.inventory.entity.BookT;

public interface BookService {
	
	
	BookT addBook(BookT bookt);
	
	Optional<BookT> getById(Integer bookId);
	
	String deleteBook(Integer bookId);
	
	String updateBook(BookT bookt);

}
