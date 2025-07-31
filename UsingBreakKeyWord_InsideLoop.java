package app_javaPratice_17;

public class UsingBreakKeyWord_InsideLoop {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			if(i==2) {
				break;//break will use only inside in loop and in while/and it help to exit the loop
			}
			System.out.println(i);
		}
	}

}
