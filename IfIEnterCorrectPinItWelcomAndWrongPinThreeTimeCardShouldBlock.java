package app_javaPratice_17;

import java.util.Scanner;

public class IfIEnterCorrectPinItWelcomAndWrongPinThreeTimeCardShouldBlock {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("Enter the pin number");
			int pinNumber = scan.nextInt();
			if(pinNumber==1234){
				System.out.println("welcom");
				break;
			}else {
				System.out.println("Wrong pin");
				if(i==2) {
					System.out.println("card is Blocked");
				}
				
			}
		}
	}
}
