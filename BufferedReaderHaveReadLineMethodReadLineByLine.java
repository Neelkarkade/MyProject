package app_javaPratice_17;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderHaveReadLineMethodReadLineByLine {
public static void main(String[] args) {
	try {
		FileReader fr = new FileReader("C:\\test\\C.txt");
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		System.out.println(br.readLine());

		
	} catch (Exception e) {
        e.printStackTrace();
	}
}
}
