package com.application.jpzp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="user")
public class User{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
    private Long id;

	@Column(name="first_name")
	@NotEmpty(message = "Please provide your first name")
	private String FName;

	@Column(name = "last_name")
	@NotEmpty(message = "Please provide your last name")	
	private String LName;

	@Column(name="password")
	private String password;

	@Column(name = "email", nullable = false, unique = true)
	@Email(message = "Please provide a valid e-mail")
	@NotEmpty(message = "Please provide an e-mail")
	private String email;
	
	@Column(name = "enabled")
	private boolean enabled;

	@Column(name = "confirmation_token")
	private String confirmationToken;

	public String getConfirmationToken() {
		return confirmationToken;
	}
	
	public void setConfirmationToken(String confirmationToken) {
		this.confirmationToken = confirmationToken;
	}

	public User(Long id, String FName, String LName, String password, String email){
		this.id = id;
		this.FName = FName;
		this.LName = LName;
		this.password = password;
		this.email = email;
	}

	public User(){
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}

	public String getFName() {
		return FName;
	}

	public String getLName() {
		return LName;
	}

	public void setFName(String name){
		this.FName = name;
	}

	public void setLName(String name){
		this.LName = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password){
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email){
		this.email = email;
	}
	
	public boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(boolean value) {
		this.enabled = value;
	}
}



	



