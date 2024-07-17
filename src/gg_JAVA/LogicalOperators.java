package gg_JAVA;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 200;
		
		if(a == 100 && b == 200) // N condition should be true
		{
			 System.out.println("AND operator");
		 }
		
		if(a == 100 || b ==123 ) // either of answer is true
		{
			System.out.println("OR operator");
		}

		if (!(a>b)) //negative of condition
		{
			System.out.println("NOT condition executed");
		}
	
	}
}
