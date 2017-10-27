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
		

	public void add(User user);//���	
	public User update(User user);//�޸�	
	public User addOrUpdate(User user);//��ӻ��޸�	
	public void delete(User user);//ɾ��
	public User findOne(Integer id);//��ѯ����ʵ��
	public List<User> findAll();//��������ʵ��
	
	@Query(value="select u from User u where u.name like :name")
	public List<User> findUserByName(@Param("name")String name);
	


 	
}
