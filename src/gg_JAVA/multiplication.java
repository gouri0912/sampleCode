package gg_JAVA;


import java.util.Scanner;

public class multiplication {
	
	public static void main(String[] args) {
	
	//Create a Java program to display the multiplication table of a given number using a for loop.
		
		Scanner number = new Scanner(System.in);
		int multiply = number.nextInt();
		
		for(int i=1 ; i<=10;i++)
		{
			int result = multiply*i;
			System.out.println(result);
		
		}
		
	}
}
