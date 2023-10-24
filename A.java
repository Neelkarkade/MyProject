package MultiCatchBlock;

public class A {
	
	public static void main(String[] args) {
		try {
			int i = 10/0;
		}catch(ArithmeticException a) {
			System.out.println(a);
		}catch( NumberFormatException n) {
		
		}catch(Exception e) {
			System.out.println(e);
		}catch(Throwable t) {
			
		}
	}
}


