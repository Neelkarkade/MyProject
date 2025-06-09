package p1;

import java.io.File;

public class Folder_Creation {
	public static void main(String[] args) {
		File f = new File("C:\\test\\p1");
		boolean val = f.mkdir();
		System.out.println(val);

	}

}
