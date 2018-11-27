package com.demothymeleaf.entities;

import java.util.Date;


public class Department extends  BasicDomain{

	/**
	 *  部门名称
	 */
	private String departmentName;




	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Department() {
	}

	public Department(Long id, Date createdDate, Date lastModifiedDate, int version, String departmentName) {
		super(id, createdDate, lastModifiedDate, version);
		this.departmentName = departmentName;
	}

	public Department(String departmentName) {
		this.departmentName = departmentName;
	}
}
