package gg_JAVA;

import java.util.Scanner;

public class Employee {
	
	String employeeName; 
	int idEmp;
	int salaryEmp;
;
	public static void main(String[] args) {
		// multi level inheritance - multiple classes are involved
   //Create a base class Employee with attributes such as name, id, and salary. 
//Derive classes Manager and Worker from Employee. Add specific attributes and methods for each derived class, like bonus calculation for Manager and hourly rate for Worker
			
		Employee obj = new Employee();
		obj.employeeInfo();
	
	}
	
	public void employeeInfo()
	{
		System.out.printf("Enter name of employee");
		
		Scanner nameEmp = new Scanner(System.in);
		 employeeName = nameEmp.next();
		
		System.out.println("Enter id of employee");
		
		
		Scanner id = new Scanner(System.in);		
		 idEmp = id.nextInt();
		
		System.out.println("Enter salary of employee");
		
		Scanner salary = new Scanner(System.in);		
		 salaryEmp = salary.nextInt();
	}

}
