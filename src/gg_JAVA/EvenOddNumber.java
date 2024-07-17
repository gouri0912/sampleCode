package gg_JAVA;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program for checking enter number is even or odd
		
		Scanner number = new Scanner(System.in);
		
		int enteredNumber = number.nextInt();
		
		if(enteredNumber%2 == 0)
		{
			System.out.println("Entered Number is Even");
		}
		
		else if(enteredNumber == 0)
		{
			System.out.println("Entered Number is 0");
		}
		else
		{
			System.out.println("Entered Number is odd");
		}
	}

}
