package com.jike.usermanage.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Depart2 {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	
	@OneToMany
	@JoinColumn(name="depart_id",referencedColumnName="id")
	private List<Employee2> employee2s;
		

	public List<Employee2> getEmployee2s() {
		return employee2s;
	}
	public void setEmployee2s(List<Employee2> employee2s) {
		this.employee2s = employee2s;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	
	
	

}
