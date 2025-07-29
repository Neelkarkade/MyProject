package app_javaPratice_17;

import java.util.Scanner;

public class ConditionOperators {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the username");
		String username = scan.next();
		System.out.println("Enter the password");
		String password = scan.next();
		if(username.equals("mike") && password.equals("test")) {
			System.out.println("welcome");
		}else {
			System.out.println("invalid credentials");
		}
	}

}
