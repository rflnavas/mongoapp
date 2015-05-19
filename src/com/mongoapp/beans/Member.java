package com.mongoapp.beans;

import java.util.Date;

public class Member {
	
	public static final String NAME = "name";
	public static final String CATEGORY = "category";
	public static final String JOIN_DATE = "joinDate";
	
	private String id;
	private String name;
	private String category;
	private Date joinDate;
	
	public Member() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof Member? (((Member) obj).getId()).equals(this.getId()):false;
	}
	
	
}
