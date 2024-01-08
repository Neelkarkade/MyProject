package app_java_8;

public class Exception_try_And_Catch_Block_A {
	 public static void main(String[] args) {
			try {
				int x = 10;
				int y = 0 ;
				int z = x/y;//stops here   (Exception Accrue)this line will create 1 Exception object & in that object it will keep mesg regision for exception object. this address going to (e)
			}catch (Exception e) {// e is a reference variable .Exception is a Build in Class 
				System.out.println(e);// But when you print (e) it not print the address. Rather it will print mesg of Exception .& one it seprress the object .further it will print 100
			}
			System.out.println(100);
		}
		}


