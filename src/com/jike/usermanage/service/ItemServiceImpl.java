package com.jike.usermanage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.jike.usermanage.exception.BookNotFound;
import com.jike.usermanage.exception.UserNotFound;
import com.jike.usermanage.model.Book;
import com.jike.usermanage.model.Item;
import com.jike.usermanage.model.Phone;
import com.jike.usermanage.model.User;
import com.jike.usermanage.repository.BookRepository;
import com.jike.usermanage.repository.ItemRepository;

@Service("itemService")
public class ItemServiceImpl implements ItemService {
	
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Override
	public void addItem(Item item){
		itemRepository.save(item);
		
	}



	
		
}
