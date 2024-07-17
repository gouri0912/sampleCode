package gg_JAVA;

import java.util.Scanner;

public class Ifelse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 18;
		String country = "Indian";
	
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Which is your citizenship country?");
		
		String citizen=scan.nextLine();
		
		
		if(citizen.equalsIgnoreCase(country))
		{
			System.out.println("Citizen is from country India");
		}
		
		else
		{
			System.out.println("Citizen is not from country" + citizen);
		}
	}

}
