package ch14;

import java.io.*;

public class StreamTest {
	public static void main(String[] args) throws IOException{
		FileOutputStream fileOutputStream = new FileOutputStream(new File("test.txt"));
		fileOutputStream.write(1);
		fileOutputStream.close();
	}
}
