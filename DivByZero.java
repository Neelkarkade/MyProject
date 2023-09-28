package exception_handling;

public class DivByZero {
	public static void main(String[] args) {
		try {
			int x=10,y=0;
			int z=x/y;
			System.out.println(z);
			}
			catch(Exception e)
			{
				System.out.println(e);
				e.printStackTrace();
			}
	}

}
