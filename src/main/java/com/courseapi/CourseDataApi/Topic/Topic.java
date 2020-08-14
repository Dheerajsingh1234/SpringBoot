package com.courseapi.CourseDataApi.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	@Id
	private String id;
	private String name;
	private String Discription;
	public Topic(String id, String name,String Discription)
	{
		super();
		this.id=id;
		this.name=name;
		this.Discription=Discription;
	}
	public Topic()
	{
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDiscription() {
		return Discription;
	}
	public void setDiscription(String disciption) {
		Discription = disciption;
	}
	

}
