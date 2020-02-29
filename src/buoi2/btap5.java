package buoi2;

import java.util.Scanner;

public class btap5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int a = sc.nextInt();
		for(int i = 0 ;i < a;i++) {
			for (int j = 0; j < a; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
