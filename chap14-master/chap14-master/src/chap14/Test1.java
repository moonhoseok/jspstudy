package chap14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.SortedMap;

public class Test1 {
	public static void main(String[] args) throws IOException {
		FileReader fr = 
			new FileReader("d:\\euckr.txt",Charset.forName("EUC-KR"));
//		FileReader fr = new FileReader("d:\\utf8.txt");
		int data=0;
		while((data=fr.read()) != -1)
			System.out.print((char)data);
	}
}
