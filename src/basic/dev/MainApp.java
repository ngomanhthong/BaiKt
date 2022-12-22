package basic.dev;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		// bai 1.
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao a");
		int a = sc.nextInt();
		System.out.println("nhap vao b");
		int b = sc.nextInt();
		System.out.println("nhap vao c");
		int c = sc.nextInt();
		coPhaiBaCanhCuaTamGiac(a, b, c);
		// bai 2.
		// a
		int[] arr = new int[10];
		ranDom(arr);
		// b
		tangDan(arr);
		// c
		demChanLe(arr);
	}

	private static void demChanLe(int[] arr) {
		System.out.println();
		int tongChan = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				tongChan++;
			}
		}
		System.out.format("Co %d so chan va %d so le", tongChan, (arr.length - tongChan));
	}

	private static void tangDan(int[] arr) {
		System.out.println();
		System.out.print("tang dan => ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}

			System.out.print(arr[i] + " ");
		}

	}

	private static void coPhaiBaCanhCuaTamGiac(int a, int b, int c) {
		if (a + b > c && a + c > b && c + b > a) {
			System.out.format("%d,%d,%d la ba canh cua tam giac", a, b, c);
		} else {
			System.out.format("%d,%d,%d khong phai la ba canh cua tam giac", a, b, c);
		}

	}

	private static void ranDom(int[] arr) {
		System.out.println();
		System.out.print("Mang arr ");
		Random rd = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(0, 101);
			System.out.format(arr[i] + " ");
		}

	}

}
