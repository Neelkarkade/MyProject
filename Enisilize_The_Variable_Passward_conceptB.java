package Encapsulation_Concept;

import java.io.BufferedReader;
import java.io.FileReader;

public class Enisilize_The_Variable_Passward_conceptB{
public static void main(String[] args) {
	
	try {
		FileReader fr = new FileReader("C:\\22August");
		BufferedReader br = new BufferedReader(fr);
		Enisilize_The_Variable_Passward_conceptA Enisilize_The_Variable_Passward_concepta1 = new Enisilize_The_Variable_Passward_conceptA();
		Enisilize_The_Variable_Passward_concepta1.setPassword(br.readLine());
		System.out.println(Enisilize_The_Variable_Passward_concepta1.getPassword());
	} catch (Exception e) {
		
	}
}
}
