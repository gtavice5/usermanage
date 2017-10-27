package com.jike.usermanage.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Phone extends Item {
	
	private String factory; 
    private Float durationTime;
    
	public String getFactory() {
		return factory;
	}
	public void setFactory(String factory) {
		this.factory = factory;
	}
	public Float getDurationTime() {
		return durationTime;
	}
	public void setDurationTime(Float durationTime) {
		this.durationTime = durationTime;
	} 
    
}
