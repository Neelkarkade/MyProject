package app_javaPratice_17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriter1 {
	public static void main(String[] args) {
		try {
			
			
			FileWriter fw = new FileWriter("C:\\test\\C.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(100);
			bw.write("mike");
            char[] x = {'d'};
            bw.write(x);
            bw.close();
            fw.close();
		} catch (Exception e) {
          e.printStackTrace();
		}
	}

}
