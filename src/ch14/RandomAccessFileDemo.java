package ch14;

import java.io.*;
import java.util.*;
 
public class RandomAccessFileDemo {
    public static void main(String[] args) {
        Student[] students = {
                new Student("A", 90), 
                new Student("B", 95), 
                new Student("C", 88), 
                new Student("D", 84)}; 
        
        try {
            File file = new File(args[0]);
            RandomAccessFile randomAccessFile = 
                    new RandomAccessFile(file, "rw"); 
            
            for(int i = 0; i < students.length; i++) { 
              randomAccessFile.writeChars(students[i].getName());
              randomAccessFile.writeInt(students[i].getScore()); 
            }
 
            Scanner scanner = new Scanner(System.in);
 
            System.out.print("讀取第幾筆資料？"); 
            
            int num = scanner.nextInt(); 
            
            randomAccessFile.seek((num-1) * Student.size()); 
            Student student = new Student(); 

            student.setName(readName(randomAccessFile));
            student.setScore(randomAccessFile.readInt());

            System.out.println("姓名：" + student.getName());
            System.out.println("分數：" + student.getScore());
 
            scanner.close();
            randomAccessFile.close(); 
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("請指定檔案名稱");
        } 
        catch(IOException e) { 
            e.printStackTrace(); 
        }
    }
 
    private static String readName(RandomAccessFile randomAccessfile)
                               throws IOException { 
        char[] name = new char[15]; 
 
        for(int i = 0; i < name.length; i++) 
            name[i] = randomAccessfile.readChar(); 

        // 將空字元取代為空白字元並傳回
        return new String(name).replace('\0', ' '); 
    } 
}