package com.jike.usermanage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class test {
	
	@Id
	@GeneratedValue(generator="uuidGenerator")
	@GenericGenerator(name="uuidGenerator",strategy="uuid")
	@Column(name="id_",length=32)
	private String id;

}
