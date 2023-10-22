package com.cg.sp;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class MallAdmin {

	
	private int id;
	private String name;
	private String password;
	
	private String phone;
	
	
	
	public MallAdmin() {
		super();
	}

	public MallAdmin(int id, String name, String password, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		
		this.phone = phone;
	}

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "MallAdmin [id=" + id + ", name=" + name + ", password=" + password + ", phone=" + phone + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getPassword()=" + getPassword() + ", getPhone()="
				+ getPhone() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
