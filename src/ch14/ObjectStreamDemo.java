package ch14;

import java.io.*;
import java.util.*;

public class ObjectStreamDemo {
	public static void main(String[] args) {
		User[] users = { new User("A", 101), new User("B", 102) };

		writeObjectsToFile(users, args[0]);
		try {
			users = readObjectsFromFile(args[0]);
			for (User user : users)
				System.out.printf("%s\t%d%n", user.getName(), user.getNumber());
			System.out.println();

			users = new User[2];
			users[0] = new User("C", 103);
			users[1] = new User("D", 104);

			appendObjectsToFile(users, args[0]);

			users = readObjectsFromFile(args[0]);
			for (User user : users)
				System.out.printf("%s\t%d%n", user.getName(), user.getNumber());

		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void writeObjectsToFile(Object[] objects, String filename) {
		File file = new File(filename);

		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
			for (Object object : objects)
				objectOutputStream.writeObject(object);
			objectOutputStream.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static User[] readObjectsFromFile(String filename) throws FileNotFoundException {
		File file = new File(filename);

		if (!file.exists())
			throw new FileNotFoundException();

		List<User> list = new ArrayList<User>();

		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

			while (fileInputStream.available() > 0)
				list.add((User) objectInputStream.readObject());
			objectInputStream.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		User[] users = new User[list.size()];
		return list.toArray(users);
	}

	public static void appendObjectsToFile(Object[] objects, String filename) throws FileNotFoundException {
		File file = new File(filename);

		if (!file.exists())
			throw new FileNotFoundException();
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file, true)) {
				protected void writeStreamHeader() throws IOException {
				}
			};
			for (Object object : objects)
				objectOutputStream.writeObject(object);
			objectOutputStream.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
