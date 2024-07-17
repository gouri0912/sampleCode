package gg_JAVA;

public class loopIfelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// write program to determine to person is eligible to vote or not
		// criteria is 18 years
		// citizen of country

		int age = 18;
		String citizen = "INDIAN";

		if (citizen.equalsIgnoreCase("Indian") && age >= 18)

		{
			System.out.println("Person is eligible to vote");
		} else {
			System.out.println("Person is not eligible to vote");
		}

	}

}
