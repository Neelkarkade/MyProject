package app_javaPratice_17;

import java.util.Scanner;

public class InputsInJava {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name:");
//        String name = scan.next();
		String name = scan.nextLine();// Advantage of line you can write multiple word
        System.out.println(name);
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        System.out.println(age);
        System.out.println("Enter your weight:");
        float weight = scan.nextFloat();
        System.out.println(weight);
        System.out.println("Enter your ans:");
        boolean val  = scan.nextBoolean();
        System.out.println(val);
	}

}
