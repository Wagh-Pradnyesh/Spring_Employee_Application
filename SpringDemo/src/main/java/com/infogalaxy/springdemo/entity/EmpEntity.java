package com.infogalaxy.springdemo.entity;

public class EmpEntity {
	
	private int id;
	private String name;
	private String email;
	private String mobno;
	
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	@Override
	public String toString() {
		return "EmpEntity [id=" + id + ", name=" + name + ", email=" + email + ", mobno=" + mobno + "]";
	}
	
	
	

}
