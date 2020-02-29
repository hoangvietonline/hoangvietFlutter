package buoi2;

import java.util.Scanner;

public class btap7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int a = sc.nextInt();
		int n = a;
		for (int r = 1; r <= a; r++) {
			for (int sp = a - r + 1; sp >= 1; sp--) {
				System.out.print(" ");
			}
			for (int c = 1; c <= r; c++) {
				System.out.print("*");
			}
			for (int c = r - 1; c >= 1; c--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
