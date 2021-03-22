package hust.soict.hedspi.lab02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Arrays {
	public static void main(String args[]) {
		long tong = 0;
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> mang = new ArrayList<Integer>();
		System.out.println("Nhap vao so phan tu mang: ");
		int size = in.nextInt();

		for (int i = 0; i < size; i++) {
			System.out.println("Nhap vao phan tu thu " + (i+1));
			int pt = in.nextInt();
			mang.add(pt);
		}
		
		
		Collections.sort(mang);
		long sum = 0;
		for(int j = 0; j < mang.size(); j++)
		    tong += mang.get(j);
		
		
		
		System.out.print("Tong la: " + tong);
		System.out.print("Trung binh la: " + tong/mang.size());
		System.out.print(mang.toString());
	}
}
