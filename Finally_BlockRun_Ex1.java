package Finally;

public class Finally_BlockRun_Ex1 {
public static void main(String[] args) {
	try {
	 int x = 10/0;
	} catch (Exception e) {
		System.out.println(e);
	}finally {
		System.out.println(1000);
	}
}
}
