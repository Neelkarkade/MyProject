package Do_While_Loop;

public class Infinite_Loop_BreakEx3 {
public static void main(String[] args) {
	for(;;) {
		if (BEx3.test()==true) {// if B test is   true then only break, if B Test Is not true ten don't apply Break Run Infinite
			break;
		}
		System.out.println("Status is false");
	}
}
}
