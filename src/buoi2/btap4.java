package buoi2;

import java.util.Scanner;

public class btap4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("Enter the multiplication table");
			int number = sc.nextInt();
			multiplicationTable(number);
		}
	}

	private static void multiplicationTable(int a) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(a + " x " + i + " = " + a * i);
		}

	}
}
