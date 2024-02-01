package Finally;
//finally
public class FinallyBlock_ForceFullyStop {
	public static void main(String[] args) {
		try {
			int x = 10/0;
		} catch (Exception e) {
		  System.out.println(e);
		}finally {
			System.exit(0);
			System.out.println(100);
		}
	}
}
