package com.yas.book.inventory.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yas.book.inventory.entity.BookT;
import com.yas.book.inventory.service.BookService;

@RestController("/book")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public BookT addBook(@RequestBody BookT bookt) {
		
		return bookService.addBook(bookt);
		
	}
	
//	@RequestMapping(value = "/update", method = RequestMethod.POST)
//	@ResponseBody
//	public void updatebook(@RequestBody BookT bookT) {
//		
//		bookService.updateBook(bookT);
//		
//	}
//	
//	@RequestMapping(value = "/delete", method = RequestMethod.POST)
//	@ResponseBody
//	public void deleteBook(@RequestParam("bookId") Integer bookId) {
//		
//		bookService.deleteBook(bookId);
//		
//	}
//	
//	@RequestMapping(value = "/listByStore", method = RequestMethod.GET)
//	@ResponseBody
//	public String listByStore(@RequestParam("storeId") Integer storeId) {
//		
//		return "Success";
//		//bookService.listByStore(storeId);
//		
//	}
//	
//	@RequestMapping(value = "/getById", method = RequestMethod.GET)
//	@ResponseBody
//	public Optional<BookT> getById(@RequestParam("bookId") Integer bookId) {
//		
//		Optional<BookT> bookT = bookService.getById(bookId);
//		return bookT;
//		
//	}
//	
//	@RequestMapping(value = "/getByGoogleId", method = RequestMethod.GET)
//	@ResponseBody
//	public void getByGoogleId(@RequestParam("googleId") Integer googleId) {
//		
//		//bookService.getByGoogleId(googleId);
//		
//	}

}
