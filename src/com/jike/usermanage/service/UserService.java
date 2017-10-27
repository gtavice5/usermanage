package com.jike.usermanage.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.jike.usermanage.exception.UserNotFound;
import com.jike.usermanage.model.User;

public interface UserService {
	//添加用户
	public void addUser(User user);
	//修改用户
	public User updateUser(User user) throws UserNotFound;
	//删除用户,根据用户编号删除
	public User deleteUser(int id) throws UserNotFound;
	//查询单个用户
	public User getUser(int id);
	//查询所有用户
	public List<User> getUsers();

		
	
}
