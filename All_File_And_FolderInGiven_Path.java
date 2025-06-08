package p1;

import java.io.File;

public class All_File_And_FolderInGiven_Path {
	public static void main(String[] args) {
		File f = new File("C:\\test\\");
		String[] val = f.list();
		for(String x:val) {
		System.out.println(x);
		}
	}
}
