package polymorphism2;

import java.util.ArrayList;


public class User {

	String recipient ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Demonstrate polymorphism by creating an array of User objects containing different types of users.
		//Have each user send a message to another user in the array, and print out the messages received by each recipient.
		 ArrayList<String> User = new ArrayList<String>();
		//User[] obj = new User[3];
		User.add("BasicUser");
		User.add("PremiumUser");
		User.add("AdminUser");
		

}
	
	public void SetMessage(User recipient, String message)
	{
		
	}

}
