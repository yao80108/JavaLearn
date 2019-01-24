package ch14;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamDemo {
	public static void main(String[] args) {
		Member[] members = { new Member("A", 90), new Member("B", 95), new Member("C", 88) };

		try {
			DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(args[0]));

			for (Member member : members) {
				dataOutputStream.writeUTF(member.getName());
				dataOutputStream.writeInt(member.getAge());
			}
			DataInputStream dataInputStream = new DataInputStream(new FileInputStream(args[0]));
			for (int i = 0; i < members.length; i++) {
				String name = dataInputStream.readUTF();
				int score = dataInputStream.readInt();
				members[i] = new Member(name, score);
			}
			
			dataInputStream.close();
			dataOutputStream.close();
			
			for (Member member : members) {
				System.out.printf("%s\t%d%n", member.getName(), member.getAge());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
