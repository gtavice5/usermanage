package com.jike.usermanage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.jike.usermanage.exception.BookNotFound;
import com.jike.usermanage.exception.UserNotFound;
import com.jike.usermanage.model.Book;
import com.jike.usermanage.model.User;
import com.jike.usermanage.repository.BookRepository;

@Service("bookService")
public class BookServiceImpl implements BookService {
	
	
	@Autowired
	private BookRepository bookRepository;
	
	public void addBook(Book book){
		bookRepository.save(book);
		
	}

	
		
}
