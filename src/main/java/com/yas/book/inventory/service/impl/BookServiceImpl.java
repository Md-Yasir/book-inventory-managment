package com.yas.book.inventory.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yas.book.inventory.entity.BookT;
import com.yas.book.inventory.repo.BookRepo;
import com.yas.book.inventory.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepo bookrepo;


	public BookT addBook(BookT bookT) {

		return bookrepo.save(bookT);
	}

	public String deleteBook(Integer bookId) {

		bookrepo.deleteById(bookId);
		return "deleted successfully";
		
	}
	
	public String updateBook(BookT bookt) {

		bookrepo.save(bookt);
		return "updated succesfully";
	}

	@Override
	public Optional<BookT> getById(Integer bookId) {
		// TODO Auto-generated method stub
		Optional<BookT> bookT = bookrepo.findById(bookId);
		return bookT;
	}

}
