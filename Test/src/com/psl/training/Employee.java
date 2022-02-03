package com.psl.training;

public class Employee {
	int empcode;

	String empname;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getEmpcode() {
		return empcode;
	}

	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	@Override
	public String toString() {
		return "Employee [empcode=" + empcode + ", empname=" + empname + "]";
	}
	
}
