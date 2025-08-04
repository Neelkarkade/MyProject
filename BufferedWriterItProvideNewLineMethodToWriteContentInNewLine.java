package app_javaPratice_17;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.attribute.AclEntry;

public class BufferedWriterItProvideNewLineMethodToWriteContentInNewLine {
public static void main(String[] args) {
	try {
		FileWriter fw = new FileWriter("C:\\test\\C.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		bw.write("mike");
		bw.newLine();
        char[] x = {'d'};
        bw.write(x);
        bw.close();
        fw.close();
	} catch (Exception e) {
         e.printStackTrace();	}
}
}
