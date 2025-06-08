package p1;

import java.util.Scanner;

public class F {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("Enter the pin number");
			int pinNumber = scan.nextInt();
			if(pinNumber==123) {
				System.out.println("welcom");
				break;
			}else {
				System.out.println("wrong pin");
				if(i==2) {
					System.out.println("Card is blocked");
					
				}
			}
		}
	}

}
