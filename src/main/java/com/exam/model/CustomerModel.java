package com.exam.model;

import java.sql.Date;

public class CustomerModel {
	private String custName;
	private String custFatherName;
	private String custMotherName;
	private int custAge;
    private Date custDob;
    
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustFatherName() {
		return custFatherName;
	}
	public void setCustFatherName(String custFatherName) {
		this.custFatherName = custFatherName;
	}
	public String getCustMotherName() {
		return custMotherName;
	}
	public void setCustMotherName(String custMotherName) {
		this.custMotherName = custMotherName;
	}
	public int getCustAge() {
		return custAge;
	}
	public void setCustAge(int custAge) {
		this.custAge = custAge;
	}
	public Date getCustDob() {
		return custDob;
	}
	public void setCustDob(Date custDob) {
		this.custDob = custDob;
	}
	public CustomerModel(String custName, String custFatherName, String custMotherName, int custAge, Date custDob) {
	
		this.custName = custName;
		this.custFatherName = custFatherName;
		this.custMotherName = custMotherName;
		this.custAge = custAge;
		this.custDob = custDob;
	}
	public CustomerModel() {
		
	}
    
}
