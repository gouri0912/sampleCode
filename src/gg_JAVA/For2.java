package gg_JAVA;

public class For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to find the sum of numbers from 1 to 100, but skip numbers divisible by 5 using a loop control statement
		int total = 0;
		for(int i = 1; i<100;)
		{
			if (i%5 == 0) {
				i = i+1;
				
			}
			total = total + i; 
			i++;
			
		}
		System.out.println("total = " + total);
	}

}

//1  ---1
//1 + 2  ---2
//1+2++3 ---3
//1+2+3+4---4
