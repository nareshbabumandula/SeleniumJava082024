package com.java.oops;

class Employee {
	
	private int empid=111;
	private String empName="john peter";
	
	public int getEmpid() {
		return empid;
	}
	
	public void setEmpid(int empid) {
		if(empid<=111) {
			System.out.println("Employee ID is not correct");
		}else {
			this.empid = empid;
		}
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
}

public class EncapsulationTest extends Employee{
	
	public static void main(String[] args) {
		EncapsulationTest et = new EncapsulationTest();
		et.setEmpid(99);
		System.out.println(et.getEmpid());
		et.setEmpName("Sajjad");
		System.out.println(et.getEmpName());
	}
}
