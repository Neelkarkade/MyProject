package Encapsulation_Concept;
import java.io.BufferedReader;
import java.io.FileReader;

public class CreateObject_IdB1 {
public static void main(String[] args) {
	CreateObject_IdA CreateObject_Ida1 = new CreateObject_IdA();
	CreateObject_Ida1.setId(1);
	CreateObject_Ida1.setName("mike");
	CreateObject_Ida1.setPassword("testing");
	
	System.out.println(CreateObject_Ida1.getId());
	System.out.println(	CreateObject_Ida1.getName());
    System.out.println(CreateObject_Ida1.getPassword());
}
}
