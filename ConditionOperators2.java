package app_javaPratice_17;

import java.util.Scanner;

public class ConditionOperators2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the username");
		String username = scan.next();
		System.out.println("Enter the password");
		String password = scan.next();
		if(username.equals("mike")) {
		  if(password.equals("test")) {
			System.out.println("welcome");
		}else {
			System.out.println("Password is invalid ");
	}
	}else{
		System.out.println("user does not exist");
	}
}
}