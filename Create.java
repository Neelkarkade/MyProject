package file;

import java.io.File;

public class Create {
	public static void main(String[] args) {
		
		try {

			File f=new File("C:\\Users\\Neel\\OneDrive\\Desktop\\file_concept\\Neel.txt");//file is created
			f.createNewFile();
			System.out.println(f.length());
			System.out.println(f.exists());
		//	System.out.println(f.delete());
		//	File f2=new File("C://NewFolder");
			//System.out.println(f2.mkdir());
			
			
		}catch(Exception e) {}
	}

}
