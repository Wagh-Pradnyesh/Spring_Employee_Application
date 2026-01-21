package com.infogalaxy.springdemo.entity;

public class DepartmentEntity {


	private String departmentName;
	private int managerId;
	private String description;
	
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	@Override
	public String toString() {
		return "DepartmentEntity [departmentName=" + departmentName + ", managerId=" + managerId + ", description="
				+ description + "]";
	}
	
	
	
	
	
	
}
