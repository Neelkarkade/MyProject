package exception_handling;

public class NullArithmeticException {
int x = 10;// non static
public static void main(String[] args) {
	try {
		NullArithmeticException a1 = null;
		System.out.println(a1.x);
		System.out.println(10);
	}
	catch(NullPointerException e) {
		e.printStackTrace();
	}
	System.out.println(100);
	
}
}
