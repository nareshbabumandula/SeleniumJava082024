package com.practice;


public class EmployeeStatic {
	int empid;
	String empname;
	String role;
	

	static String companyname="Amazon";

	/*public EmployeeStatic(int i,String emp,String r) {
		empid=i;
		empname=emp;
		role=r;
	}*/
	static void changeCompanyname()
	{
		companyname="Google";
	}
	EmployeeStatic(int i,String emp,String r)
	{
empid=i;
empname=emp;
role=r;
	}
	

	public void getEmpdetails() {
		System.out.println(empid+" "+empname+" "+role+" "+companyname);
	}
	public static void main(String[] args) {
		//changeCompanyname();
		EmployeeStatic em1=new EmployeeStatic(100,"Ram","QA");
		em1.getEmpdetails();
		EmployeeStatic em2=new EmployeeStatic(101,"Arjun","AE");
		em2.getEmpdetails();
		changeCompanyname();
		EmployeeStatic em3=new EmployeeStatic(105,"Kanha","Developer");
		em3.getEmpdetails();
		
		
		
	}
}

