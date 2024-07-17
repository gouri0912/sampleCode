package gg_JAVA;
import java.util.Scanner;

public class CAse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//take variable grade, store a,b,c,d .Depending on grade output result
		//int grade =80;
	
		Scanner grade = new Scanner(System.in);
		int score = grade.nextInt();
		
		switch(score) {
		
		case 80:
			System.out.println("Result is 80+" );
			break;
			
		case 70:
			System.out.println("Result is 70+" );
			break;
			
		case 60:
			System.out.println("Result i 60+s");
			break;
		case 50:
			System.out.println("Result is 50+" );
			break;
		default:			
			System.out.println("Result is less than 50% or more than 90%" );
		}
		
			
		
	}

}
