package ch14;

import java.util.*;
import java.io.*;

public class SequenceStreamDemo {
	public static void main(String[] args) {
		try {
			switch (args[0].charAt(1)) {
			case 's':
				int size = Integer.parseInt(args[1]);
				seperate(args[2], size);
				break;
			case 'c':
				int number = Integer.parseInt(args[1]);
				concatenate(args[2], number);
				break;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void seperate(String filename, int size) throws IOException {
		FileInputStream fileInputStream = new FileInputStream(new File(filename));
		BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

		byte[] data = new byte[1];
		int count = 0;
		if (fileInputStream.available() % size == 0)
			count = fileInputStream.available() / size;
		else
			count = fileInputStream.available() / size + 1;

		for (int i = 0; i < count; i++) {
			int num = 0;

			File file = new File(filename + "_" + (i + 1));
			BufferedOutputStream bufOutputStream = new BufferedOutputStream(new FileOutputStream(file));
			while (bufferedInputStream.read(data) != -1) {
				bufOutputStream.write(data);
				num++;
				if (num == size) {
					bufOutputStream.flush();
					bufOutputStream.close();
					break;
				}
			}
			if (num < size) {
				bufOutputStream.flush();
				bufOutputStream.close();
			}
		}
		System.out.println("分割為 " + count + " 個檔案");
	}

	public static void concatenate(String filename, int number) throws IOException {
		List<InputStream> list = new ArrayList<InputStream>();

		for (int i = 0; i < number; i++) {
			File file = new File(filename + "_" + (i + 1));
			list.add(i, new FileInputStream(file));
		}

		final Iterator<InputStream> iterator = list.iterator();

		Enumeration<InputStream> enumation = new Enumeration<InputStream>() {
			public boolean hasMoreElements() {
				return iterator.hasNext();
			}

			public InputStream nextElement() {
				return iterator.next();
			}
		};

		BufferedInputStream bufInputStream = new BufferedInputStream(new SequenceInputStream(enumation), 8192);

		BufferedOutputStream bufOutputStream = new BufferedOutputStream(new FileOutputStream(filename), 8192);

		byte[] data = new byte[1];

		while (bufInputStream.read(data) != -1)
			bufOutputStream.write(data);

		bufInputStream.close();
		bufOutputStream.flush();
		bufOutputStream.close();
		System.out.println("組合" + number + "個檔案 OK!!");
	}
}
