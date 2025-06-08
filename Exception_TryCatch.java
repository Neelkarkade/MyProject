package p1;

import java.io.File;

public class Exception_TryCatch {
	public static void main(String[] args) {
		try {
			File f = new File("C:\\test\\A.txt");
			boolean val = f.createNewFile();
			System.out.println(val);
		} catch (Exception e) {
    e.printStackTrace();
    }
	}

}
