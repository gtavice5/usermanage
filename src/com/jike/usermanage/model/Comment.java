package com.jike.usermanage.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Comment {
	
	@Column(name="title_",length=100)
	String title;
	@Column(name="content_")
	String content;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	

}
