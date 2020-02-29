package buoi1;

import java.util.Scanner;

public class baitap3 {
	public static void main(String[] args) {
		float a;
		float b;
		String c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập a : ");
		a = sc.nextInt();
		sc.nextLine();
		System.out.println("nhâp string");
		c= sc.nextLine();
		System.out.println("nhập b : ");
		b = sc.nextInt();
		sc.nextLine();
		System.out.println("Kết quả của phương trình ax + b = 0");
		System.out.println("Với a = " + a + ", b = " + b + "==> x = " + getResult(a, b));
	}

	private static float getResult(float a, float b) {
		return (float) -b / a;
	}
}
