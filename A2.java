package app_javaPratice_17;



public class A2 {
	public static void main(String[] args) {
		A2 a1 = new A2();
		 a1.test(100,200,300);
		
		
	}
	
	public void test(int...x) { 
    System.out.println(x[0]);	
    System.out.println(x[1]);
    System.out.println(x[2]);
	}
	
}
