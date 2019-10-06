package com.cjc.app.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empid;
	private String name,email;
	@ManyToOne( cascade=CascadeType.ALL)
	private CompanyAddress address;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
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
	public CompanyAddress getAddress() {
		return address;
	}
	public void setAddress(CompanyAddress address) {
		this.address = address;
	}
	
}
