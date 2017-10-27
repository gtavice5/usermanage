

package com.jike.usermanage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Employee2 {
	
	@Id 
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long eid; 
    private String  name;
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getEid() {
		return eid;
	}
	public void setEid(Long eid) {
		this.eid = eid;
	}
	
    
    

}
