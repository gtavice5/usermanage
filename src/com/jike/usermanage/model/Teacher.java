package com.jike.usermanage.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Teacher {

	@Id 
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long tid; 
    private String name; 
    private Boolean gender; 
    private int age; 
    private int height; 
    @ManyToMany 
    @JoinTable(name = "teacher_student", 
		joinColumns = @JoinColumn(name = "teacher_id",referencedColumnName="tid"), 
		inverseJoinColumns = @JoinColumn(name = "student_id",referencedColumnName="sid"))
    private List<Student> students;
    

	public Long getTid() {
		return tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getGender() {
		return gender;
	}
	public void setGender(Boolean gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	} 
    
    
    
	
}
