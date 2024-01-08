package app_java_8;

public class D extends C{
	public static void main(String[] args) {
		B b1 = new B ();
		b1.test();
	}
	public static void test () {// super  keyword cannot used inside context
  System.out.println(D.j);// it will automatically take super keyword
}
}
