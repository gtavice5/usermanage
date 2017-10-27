package com.jike.usermanage.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Depart {
	@Id
	@GeneratedValue
	private Long did;
	private String name;

	@OneToMany
	@JoinTable(name = "depart_employee", 
		joinColumns = @JoinColumn(name = "depart_id",referencedColumnName="did"), 
		inverseJoinColumns = @JoinColumn(name = "employee_id",referencedColumnName="eid"))
	private List<Employee> employees;

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}



	public Long getDid() {
		return did;
	}

	public void setDid(Long did) {
		this.did = did;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
