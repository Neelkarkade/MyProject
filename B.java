package app_java_8;

public class B extends A {
	public static void main(String[] args) {
		B b1 = new B();
		b1.test ();
	}
	public void test() {
		System.out.println(A.j);
	}

}
