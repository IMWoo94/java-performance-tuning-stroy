package com.perf.pattern;

import java.io.Serializable;

public class EmployeeTO implements Serializable{
	private String empName;
	private String empId;
	private String emmPhone;
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getEmpId() {
		return empId;
	}
	
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	public String getEmmPhone() {
		return emmPhone;
	}
	
	public void setEmmPhone(String emmPhone) {
		this.emmPhone = emmPhone;
	}

	@Override
	public String toString() {
		return "EmployeeTO [empName=" + empName + ", empId=" + empId + ", emmPhone=" + emmPhone + "]";
	}
	
}
