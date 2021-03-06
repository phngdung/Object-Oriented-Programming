package src.Lab02;

import java.util.Scanner;

public class Matrix {
	public static void main(String args[]) {
		int hang, cot, x, y;
		Scanner in = new Scanner(System.in);

		System.out.println("Nhap vao so hang cua ma tran: ");
		hang = in.nextInt();
		System.out.println("Nhap vao so cot cua ma tran: ");
		cot = in.nextInt();

		int matran1[][] = new int[hang][cot];

		System.out.println("Nhap vao phan tu cua ma tran thu nhat: ");

		for (x = 0; x < hang; x++)
			for (y = 0; y < cot; y++)
				matran1[x][y] = in.nextInt();

		int matran2[][] = new int[hang][cot];

		System.out.println("Nhap vao phan tu cua ma tran thu hai: ");

		for (x = 0; x < hang; x++)
			for (y = 0; y < cot; y++)
				matran2[x][y] = in.nextInt();

		int matrantong[][] = new int[hang][cot];

		for (x = 0; x < hang; x++)
			for (y = 0; y < cot; y++)
				matrantong[x][y] = matran1[x][y] + matran2[x][y];

		System.out.println("Tong cua hai ma tran: ");

		for (x = 0; x < hang; x++) {
			for (y = 0; y < cot; y++)
				System.out.print(matrantong[x][y] + "\t");

			System.out.println();
		}
	}
}
