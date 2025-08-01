package app_javaPratice_17;

import java.util.Scanner;

public class WriteEvenOrOddNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int val = scan.nextInt();
		if(val%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}

}
