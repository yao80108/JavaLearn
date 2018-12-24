package ch6;

public class StringDemo {
	public static void main(String[] args) {
		String str = "Hello";

		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.equals("Hello"));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());

		String text = "One's left brain has nothing right.\n" + "One's right brain has nothing left.\n";

		for (int i = 0; i < text.length(); i++)
			System.out.print(text.charAt(i));

		System.out.println(text.indexOf("left"));
		System.out.println(text.lastIndexOf("left"));

		char[] charArr = text.toCharArray();
		System.out.println();
		for (int i = 0; i < charArr.length; i++)
			System.out.print(charArr[i]);

		String str1 = "qwerasdf";
		String str2 = "qwerasdf";
		System.out.println(str1 == str2);

		str1 = "abc";
		System.out.println(str2);

		String str3 = "fly";
		String str4 = "weight";
		String str5 = "flyweight";
		String str6 = null;

		str6 = str3 + str4;
		System.out.println(str5 == str6);

		str6 = (str3 + str4).intern();
		System.out.println(str5 == str6);

		text = "";
		long beginTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++)
			text = text + i;
		long endTime = System.currentTimeMillis();
		System.out.println("Time: " + (endTime - beginTime));

		StringBuilder builder = new StringBuilder("");
		beginTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++)
			builder.append(String.valueOf(i));
		endTime = System.currentTimeMillis();
		System.out.println("Time: " + (endTime - beginTime));

		for (int i = 0; i < args.length; i++)
			System.out.println(args[i] + " ");

		String[] fakeFileData = { "Hello\t11/11/11\t0912345678\t1111111", "World\t12/12/12\t0987654321\t2222222" };

		System.out.println(fakeFileData);
		for (String data : fakeFileData) {
			System.out.println(data);
			String[] tokens = data.split("\t");
			for (String token : tokens)
				System.out.print(token + "\t| ");
			System.out.println();
		}

		text = "abcjgaojgao9djoisfuacbcabc";
		String[] tokens = text.split(".bc");
		for (String token : tokens)
			System.out.println(token + " ");
		System.out.println();
		tokens = text.split("..cd");
		for (String token : tokens)
			System.out.print(token + " ");
		System.out.println();

		
	}
}
