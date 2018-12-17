package ch5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] score = { 90, 80, 50, 90, 70 };

		for (int i = 0; i < score.length; i++)
			System.out.printf("score[%d] %d%n", i, score[i]);

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++)
			arr[i] = i;
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
		int[] score2 = new int[] { 90, 80, 50, 90, 70 };
		for (int i = 0; i < score2.length; i++)
			System.out.printf("score2[%d] %d%n", i, score2[i]);

		Scanner scanner = new Scanner(System.in);

		Random ran = new Random();
		int length = ran.nextInt(5) + 10;
		float[] score3 = new float[length];

		for (int i = 0; i < score3.length; i++)
			score3[i] = ran.nextInt(100);
		float total = 0;
		for (int i = 0; i < score3.length; i++) {
			total = total + score3[i];
			System.out.print(score3[i] + " ");
		}
		System.out.println();
		System.out.println("avg: " + total / score3.length);

		int[][] arr2 = { { 1, 2, 3 }, { 3, 4, 6 } };
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}

		int arr3[][];

		arr3 = new int[2][];
		arr3[0] = new int[3];
		arr3[1] = new int[5];

		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				arr3[i][j] = j + 1;
			}
		}

		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}

		int[] arr4 = { 1, 2, 3, 4, 5 };
		int[] tmp1 = arr4;
		int[] tmp2 = arr4;

		for (int i = 0; i < tmp1.length; i++)
			System.out.print(tmp1[i] + " ");
		System.out.println();
		for (int i = 0; i < tmp2.length; i++)
			System.out.print(tmp2[i] + " ");
		System.out.println();

		tmp1[2] = 9;
		for (int i = 0; i < tmp1.length; i++)
			System.out.print(tmp1[i] + " ");
		System.out.println();
		for (int i = 0; i < tmp2.length; i++)
			System.out.print(tmp2[i] + " ");

		int[] arr5 = { 1, 2, 3, 4, 5 };
		int[] arr6 = { 5, 6, 7 };
		int[] tmp = arr5;
		for (int i = 0; i < tmp.length; i++)
			System.out.print(tmp[i] + " ");

		System.out.println();
		tmp = arr6;
		for (int i = 0; i < tmp.length; i++)
			System.out.print(tmp[i] + " ");

		System.out.println();
		int[] arr7 = { 1, 2, 3, 4, 5 };
		int[] arr8 = new int[5];

		for (int i = 0; i < arr7.length; i++)
			arr8[i] = arr7[i];

		for (int i = 0; i < arr8.length; i++)
			System.out.print(arr8[i] + " ");
		System.out.println();

		arr7[2] = 100;
		for (int i = 0; i < arr7.length; i++)
			System.out.print(arr7[i] + " ");
		System.out.println();
		for (int i = 0; i < arr8.length; i++)
			System.out.print(arr8[i] + " ");
		System.out.println();

		int[] arr9 = { 1, 2, 3, 4, 5 };
		int[] arr10 = new int[5];

		System.arraycopy(arr9, 0, arr10, 0, arr9.length);

		for (int i = 0; i < arr10.length; i++)
			System.out.print(arr10[i] + " ");
		System.out.println();

		int[] arr11 = new int[30];
		for (int i = 0; i < arr11.length; i++) {
			arr11[i] = ran.nextInt(100);
			System.out.print(arr11[i] + " ");
		}
		System.out.println();
		Arrays.sort(arr11);
		for (int i = 0; i < arr11.length; i++)
			System.out.print(arr11[i] + " ");
		System.out.println();
		int key = ran.nextInt(20);
		int find = -1;
		System.out.println(key);
		if ((find = Arrays.binarySearch(arr11, key)) > -1)
			System.out.println("index: " + find);
		else
			System.out.println("Not find index");

		int[] arr12 = new int[10];
		int[] arr13 = new int[10];
		int[] arr14 = new int[10];

		Arrays.fill(arr12, 5);
		Arrays.fill(arr13, 5);
		Arrays.fill(arr14, 10);
		for (int i = 0; i < arr12.length; i++)
			System.out.print(arr12[i] + " ");
		System.out.println();
		System.out.println(Arrays.equals(arr12, arr13));
		System.out.println(Arrays.equals(arr12, arr14));

		int[] arr15 = { 1, 2, 3, 4, 5 };
		int[] arr16 = { 1, 2, 3, 4, 5 };

		int[] tmp4 = arr15;

		System.out.println(arr15 == tmp4);
		System.out.println(arr16 == tmp4);

		int[][] arr17 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] arr18 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] arr19 = { { 0, 1, 3 }, { 4, 6, 4 }, { 7, 8, 9 } };

		System.out.println("arr17 內容等於 arr18 ? " + Arrays.deepEquals(arr17, arr18));
		System.out.println("arr17 內容等於 arr18 ? " + Arrays.deepEquals(arr17, arr19));
		System.out.println("arr17 deepToString()\n\t" + Arrays.deepToString(arr17));
		scanner.close();
	}
}
