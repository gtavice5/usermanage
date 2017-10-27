package com.jike.usermanage.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.jike.usermanage.exception.BookNotFound;
import com.jike.usermanage.exception.UserNotFound;
import com.jike.usermanage.model.Book;
import com.jike.usermanage.model.User;

public interface BookService {
	
	public void addBook(Book book);
	
	
		
}
