package com.jike.usermanage.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jike.usermanage.model.User;

public interface UserRepository extends JpaRepository<User,Integer>,JpaSpecificationExecutor<User>{
		

	public void add(User user);//添加	
	public User update(User user);//修改	
	public User addOrUpdate(User user);//添加或修改	
	public void delete(User user);//删除
	public User findOne(Integer id);//查询单个实体
	public List<User> findAll();//查找所有实体
	
	@Query(value="select u from User u where u.name like :name")
	public List<User> findUserByName(@Param("name")String name);
	


 	
}
