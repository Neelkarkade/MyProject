package p1;

import java.util.Scanner;

public class G {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your percentage");
		int percentage = scan.nextInt();
		
		if(percentage>=35 && percentage<60){
		System.out.println("Secound class");
	}else if(percentage>=60 && percentage<80){
	System.out.println("First class");
	}else if(percentage>80 && percentage<100){
	System.out.println(" Distinction");
	}else {
		System.out.println("fail");
	}
		scan.close();
	}

}
