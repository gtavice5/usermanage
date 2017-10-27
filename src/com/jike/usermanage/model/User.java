package com.jike.usermanage.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GenericGenerator;


@NamedQueries({
	@NamedQuery(name="findUserByName",query="select u from User u where u.name like ?1")		
})
@Entity
@Table(name="t_user")
public class User {


	@Id
	@GeneratedValue
	@Column(name="id_")
	private Integer id;	
	
	@Column(name="name_", length=60)
	private String name;
	
	@Column(name="phone_", length=11)
	private String phone;
	
	@Column(name="inCome_", precision=12, scale=2)
	private BigDecimal inCome;
	
	@Column(name="old_")
	private Integer old;
	
	@Column(name="worktimes_")
	private Integer worktime;	
	
	@OneToMany(fetch=FetchType.EAGER)
	private List<Interest> interests;
	
	public User(){
		
	}
	
	public User(Integer id, String name){
		
		this.id = id;
		this.name = name;
		
	}
  	
	public Integer getWorktime() {
		return worktime;
	}
	public void setWorktime(Integer worktime) {
		this.worktime = worktime;
	}
	public Integer getOld() {
		return old;
	}
	public void setOld(Integer old) {
		this.old = old;
	}
	public List<Interest> getInterests() {
		return interests;
	}
	public void setInterests(List<Interest> interests) {
		this.interests = interests;
	}
	public BigDecimal getInCome() {
		return inCome;
	}
	public void setInCome(BigDecimal inCome) {
		this.inCome = inCome;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}
