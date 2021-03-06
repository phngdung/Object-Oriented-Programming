package src.Lab02;

import java.util.Scanner;

public class Star {
	
	public static void star(int s)
	{
		for (int i = 0; i < s; i++) {
			for (int j = s - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int s = in.nextInt();
		star(s);
	}
}
