package ch14;

import java.io.*;

public class BufferedStreamDemo {
	public static void main(String[] args) {
		try {
			byte[] data = new byte[1];

			File srcFile = new File(args[0]);
			File desFile = new File(args[1]);

			BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(srcFile));
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(desFile));

			System.out.println("Copy OK: " + srcFile.length() + " Byte");
			while (bufferedInputStream.read(data) != -1) {
				bufferedOutputStream.write(data);
			}

			bufferedOutputStream.flush();

			bufferedInputStream.close();
			bufferedOutputStream.close();

			System.out.println("Copy Finish");

		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
