package MultiCatchBlock;

public class  EnsureSequence_Class_
Child_To_ParentEx1.3 {
	int i = 10;
	public static void main(String[] args) {
		try {
			EnsureSequence_Class_Child_To_ParentEx1.3  a1 = null;
			System.out.println(a1.i);
		}catch(ArithmeticException a) {
			System.out.println(a);
		}catch(NumberFormatException n) {
			System.out.println(n);
		}catch(Exception e) {
			System.out.println(e);
		}catch(Throwable t) {
			System.out.println(t);
		}
	}
}
