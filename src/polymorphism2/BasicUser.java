package polymorphism2;



public class BasicUser extends User {

	String [] recipient;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a simple messaging application where users can send messages to each other. Implement three types of users: 
	//	BasicUser, PremiumUser, and AdminUser. Each user should have a method sendMessage(User recipient, String message) that sends a message to another user.

//For BasicUser, each message should be prefixed with "From [username]: " before being sent to the recipient. PremiumUser messages should be prefixed with "Important message from [username]: ", and AdminUser messages should be prefixed with "ADMIN ALERT: ".

//Demonstrate polymorphism by creating an array of User objects containing different types of users. Have each user send a message to another user in the array, and print out the messages received by each recipient.
		
		
		//String [] recipient = {"BasicUser","PremiumUser","AdminUser"};
		
		 
		BasicUser obj = new BasicUser();
		
		//obj.sendMessage(recipient[1], "send from basic user to");
		//obj.sendMessage(rec, null);
		
	}
	
public void sendMessage(User recipient, String message)
{
		System.out.println("From " + recipient + ":");
	

}

}

//