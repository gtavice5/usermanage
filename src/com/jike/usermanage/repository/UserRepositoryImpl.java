package com.jike.usermanage.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.FetchType;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CollectionJoin;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Fetch;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Selection;
import javax.persistence.metamodel.EntityType;

import org.springframework.transaction.annotation.Transactional;

import com.jike.usermanage.model.Interest;
import com.jike.usermanage.model.User;

public class UserRepositoryImpl {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void add(User user) {
		entityManager.persist(user);

	}
	@Transactional
	public User update(User user) {
		User userUpdate = entityManager.find(User.class, user.getId());
		userUpdate.setName(user.getName());
		userUpdate.setPhone(user.getPhone());	
		return userUpdate;
	}
	@Transactional
	public User addOrUpdate(User user) {
		
		return entityManager.merge(user);
	}
	@Transactional
	public void delete(User user) {
		entityManager.remove(user);

	}

	public User findOne(Integer id) {
		
		return entityManager.find(User.class, id);
	}
	
	@Transactional
	public List<User> findAll() {
		
		//��ѯ�����������20��ʵ��
		//JPQL: select u.old,u.name from User u left join u.interests where u.old > 20
		
		/*
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery cq = cb.createQuery();
		
		Root<User> root = cq.from(User.class);
		root.join("interests",JoinType.LEFT);
		Fetch rootFetch = root.fetch("interests");
		cq.select(cb.construct(User.class, root.get("old"),root.get("name")));
		//cq.multiselect(root.get("old"),root.get("name"));
		Predicate pre = cb.greaterThan(root.get("old").as(Integer.class), cb.parameter(Integer.class,"old"));
		Predicate pre1 = cb.greaterThan(root.get("workTime").as(Integer.class), cb.parameter(Integer.class,"workTime"));
		cq.where(pre,pre1);
		cq.orderBy(cb.desc(root.get("old")),cb.asc(root.get("workTime")));
		
		Query query = entityManager.createQuery(cq);
		query.setParameter("old", 20);
		query.setParameter("workTime", 1);
		List<User> users = query.getResultList();
		
		return users;
		*/
		
		//ʹ��������ѯ
		Query query = entityManager.createNamedQuery("findUserByName");
		query.setParameter(1, "%王%");		
		List<User> users = query.getResultList();
		return users;
		
	}
	


}
