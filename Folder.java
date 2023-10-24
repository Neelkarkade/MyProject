package file;
import java.io.File;
import java.util.*;

public class Folder {
	public static void main(String[] args) {
	try {
		File f=new File("C:\\22August");
		String [] a=f.list();
		
		for(String s:a) {       //enhance loop for strings
			System.out.println(s);
		}
	
	
	}
	catch(Exception e) {}
	}

}
