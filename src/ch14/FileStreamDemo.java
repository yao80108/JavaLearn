package ch14;

import java.io.*;

public class FileStreamDemo {
	public static void main(String[] args) {
		try {
			byte[] buffer = new byte[1024];

			FileInputStream fileInputStream = new FileInputStream(new File(args[0]));
			FileOutputStream fileOutputStream = new FileOutputStream(new File(args[1]));

			System.out.println("複製檔案：" + fileInputStream.available() + "位元組");

			while (true) {
				if (fileInputStream.available() < 1024) {
					int remain = -1;
					while ((remain = fileInputStream.read()) != -1) {
						fileOutputStream.write(remain);
					}
					break;
				} else {
					fileInputStream.read(buffer);
					fileOutputStream.write(buffer);
				}
			}
			
            fileInputStream.close(); 
            fileOutputStream.close(); 

            System.out.println("複製完成"); 			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
