package com.jike.usermanage.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.TableGenerator;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) 
public class Item {
/*	@Id 
    @GeneratedValue(strategy = GenerationType.AUTO) */
  
  @Id	
  @GeneratedValue(strategy = GenerationType.TABLE, generator = "ItemGenerator")
  @TableGenerator(name = "ItemGenerator",table="pk_generator",
					pkColumnName="gen_name",
					valueColumnName="gen_value",
					pkColumnValue="item_pk",
					initialValue=0,
					allocationSize=1)
    private Long id; 
    private String title; 
    private Float price;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	} 

}
