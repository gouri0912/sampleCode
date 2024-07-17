package gg_JAVA;

public class Worker extends Manager {

	static String wageName;
	static int wageSalary;
	static int finalBonus;
	static int totalwages;
	static int wageId;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
		Worker obj = new Worker();
		obj.employeeInfo();
		
		 wageName = obj.employeeName;	
		 wageSalary = obj.salaryEmp;
		 	 
		 System.out.println("wageName " + wageName);
		 System.out.println("wageSalary " + wageSalary);
		 		
		obj.bonusCalc(wageName,wageSalary);
		
		finalBonus = obj.bonus;
		 wageId = obj.empId;
		
		obj.Wages(wageName,wageSalary,finalBonus);

	}
	
	public void Wages(String Name, int Salary, int bonus)
	{
		
		 totalwages = Salary + bonus;
		
		System.out.println("Total wages = " + totalwages);
	}

}
