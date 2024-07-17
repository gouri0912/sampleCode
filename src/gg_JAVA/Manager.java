package gg_JAVA;

public class Manager extends Employee {

	static String empName;
	static int empId;
	static int empSalary;
	static int bonus;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //bonus calc
		Manager obj = new Manager();
		obj.employeeInfo();
		
	 empName = obj.employeeName;
	 empId = obj.idEmp;
	 empSalary = obj.salaryEmp;
	
		obj.bonusCalc(empName, empSalary);		
	
	}
	
	public void bonusCalc(String empName, int empSalary) {
		
	
		System.out.println("salary for employee = " + empSalary);
		
		 bonus = empSalary * 10/100;
		
		 System.out.println("bonus for employee = " + bonus);
		
		
	}

}
