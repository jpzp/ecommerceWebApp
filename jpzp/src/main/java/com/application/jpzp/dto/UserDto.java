package com.application.jpzp.dto;

import com.application.jpzp.model.User;

public class UserDto {
	private User user;
	
	private String fName;
	
	private String lName;
	
	private String password;
	
	private String phone;
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
}
