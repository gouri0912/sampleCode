package gg_JAVA;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//take input from the user and find factorial of number, 
		
		Scanner number = new Scanner(System.in);
		int fact = number.nextInt();
		int result = 1;
		
		if(fact>=1) {
		
		while( fact > 1) {
			
				int y = fact; 			
				result = result*y ; 				
				fact--;
			
			
		}
		
		System.out.println("Factorial of number is " + result);

	}
		else
		{
		System.out.println("cannot have factorial of number 0 ");
		}
	}
}