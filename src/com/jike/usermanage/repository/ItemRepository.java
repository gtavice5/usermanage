package com.jike.usermanage.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jike.usermanage.model.Item;
import com.jike.usermanage.model.Phone;
import com.jike.usermanage.model.User;

public interface ItemRepository  extends JpaRepository<Item,Integer>{
		

	
 	
}
