package exception_handling;

public class ArithmeticException {
public static void main(String[] args) {
	try {
		int x = 10;
		int y = 0;
		int z = x%y;
		System.out.println(z);
		} 
	catch(Exception e) { // if  write ArithmeticException or Exception it will run . try will handle 
			e.printStackTrace();
		}
	System.out.println(100);
	}
}

