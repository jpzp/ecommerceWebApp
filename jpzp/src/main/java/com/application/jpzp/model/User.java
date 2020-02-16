package com.application.jpzp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	private String FName;

	private String LName;

	private String DOB;

	private String address;

	private String city;

	private String state;

	private String phone;

	public User(Long id, @NotNull(message = "First name is required") String FName, @NotNull(message = "Last name is required") String LName, String DOB, String address, String city, String state, String phone){
		this.id = id;
		this.FName = FName;
		this.LName = LName;
		this.DOB = DOB;
		this.address = address;
		this.city = city;
		this.state = state;
		this.phone = phone;
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

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String DOB){
		this.DOB = DOB;
	}
	
	public String getAddress(){
		return address;
	}

	public void setAddress(String addy){
		this.address = addy;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city){
		this.city = city;
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}
}



	



