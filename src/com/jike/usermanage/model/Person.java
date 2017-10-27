package com.jike.usermanage.model;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;

@Entity
public class Person {
	@Id 
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long id; 
    private String name;
    private int age;
    
    @OneToOne(cascade={CascadeType.REFRESH,CascadeType.REMOVE},fetch=FetchType.LAZY)
    //@JoinColumn(name="address_id",referencedColumnName="aid")
    //@JoinColumns(value={@JoinColumn(name="address_id",referencedColumnName="aid"),@JoinColumn(name="address_id2",referencedColumnName="aid2")})
    private Address address;   
    
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

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
