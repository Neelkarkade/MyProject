package IfInterfaceHaveTwoMethodAndClassHaveToDevelope;

public class B implements A {

	@Override
	public void test1() {
		
		System.out.println(1);
	}

	@Override
	public void test2() {
		
		System.out.println(2);
	}
	public static void main(String[] args) {
		B b1 = new B();
		b1.test1();
		b1.test2();
	}
	

}
