package gg_JAVA;

import java.util.Scanner ;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to take two number from user and check who is max
		
		Scanner Number = new Scanner(System.in);
		
		int NumberA = Number.nextInt();
		int NumberB = Number.nextInt()
;
		if (NumberA>NumberB){
			System.out.println("Number A is MAX");
		}
		else if(NumberB>NumberA){
			System.out.println("Number B is MAX");
		}
		else if (NumberA==NumberB)
			{
				System.out.println("Number A nd B are equal");
			}
		}

}
