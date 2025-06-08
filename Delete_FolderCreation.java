package p1;

import java.io.File;

public class Delete_FolderCreation{
	public static void main(String[] args) {
		File f = new File("C:\\test\\p1");
		boolean val = f.delete();
		System.out.println(val);

	}
}
