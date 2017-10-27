package com.jike.usermanage.service;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import com.jike.usermanage.exception.UserNotFound;
import com.jike.usermanage.model.User;
import com.jike.usermanage.repository.UserRepository;


@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void addUser(User user) {
		userRepository.save(user);
		
	}

	@Override
	public User updateUser(User user) throws UserNotFound {
		User userUpdate = userRepository.findOne(user.getId());
		if (userUpdate==null)
			throw new UserNotFound();
		if (user.getName()!=null)
			userUpdate.setName(user.getName());
		
		if (user.getPhone()!=null)
			userUpdate.setPhone(user.getPhone());
		userRepository.save(userUpdate);
		return userUpdate;
	}

	@Override
	public User deleteUser(int id) throws UserNotFound {
		User userDelete = userRepository.findOne(id);
		if (userDelete==null)
			throw new UserNotFound();
		userRepository.delete(userDelete);
		return userDelete;
	}

	@Override
	public User getUser(int id) {

		return userRepository.findOne(id);
	}

	@Override
	public List<User> getUsers() {

		return userRepository.findUserByName("%王%");
		//return null;
	}







}
