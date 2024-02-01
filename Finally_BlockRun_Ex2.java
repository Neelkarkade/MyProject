package Finally;

public class Finally_BlockRun_Ex2 {
public static void main(String[] args) {
	try {
		 int x = 10/0;
		
		}finally {
			System.out.println(1000);
		}
    System.out.println(100);
}
}
