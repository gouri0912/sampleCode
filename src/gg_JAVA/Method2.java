package gg_JAVA;

import java.util.Scanner;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner age = new Scanner(System.in);
		
		int inputAge = age.nextInt();
		
		//person is eligible to vote or not
		Method2 eligibilityVote = new Method2();
		eligibilityVote.getEligibility(inputAge);
		

	}
	
	public void getEligibility(int inputAge)
	{
				
		if(inputAge >=18)
		{
			System.out.println("Person is Eligible to vote");
		}
		else
		{
			System.out.println("Person is not Eligible to vote");
		}
	}

}
