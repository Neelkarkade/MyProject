package p1;

import java.io.File;

public class N {
	public static void main(String[] args) {
		File f = new File("C:\\test\\A.txt");
		boolean val = f.delete();
		System.out.println(val);
	}

}
