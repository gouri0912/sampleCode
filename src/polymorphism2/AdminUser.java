package polymorphism2;

import java.util.Scanner;

public class AdminUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String message = ":";

AdminUser obj = new AdminUser();
obj.sendMessage(null, message);

	}
	
	public void sendMessage(User recipient, String message) {
		System.out.println("ADMIN ALERT: " + message);
	}

}
