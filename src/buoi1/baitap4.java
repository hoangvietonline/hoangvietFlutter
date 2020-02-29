package buoi1;

import java.util.Scanner;

public class baitap4 {
	public static void main(String[] args) {
		float a;
		float b;
		float c;
		Scanner sc = new Scanner(System.in);
		System.out.println("==GIẢI PHƯƠNG TRÌNH==");
		System.out.println("nhập a : ");
		a = sc.nextFloat();
		System.out.println("nhập b : ");
		b = sc.nextFloat();
		System.out.println("nhập c : ");
		c = sc.nextFloat();
		findX(a, b, c);
	}
	private static void findX(float a,float b,float c) {
		if(a == 0) {
			System.out.println("Phương trình có nghiệm : " + (float)-c/b);
		}else {
			float detal = b * b -4 * a *c;
			if (detal< 0 ) {
				System.out.println("phương trình vô nghiệm");
			}else if (detal == 0) {
				float x = (float)-b/2*a;
				System.out.println("phương trình có 2 nghiệm kép : "+ x);
			}else {
				float x1 = (float)((-b + Math.sqrt(detal))/(2 *a));
				float x2 = (float)((-b - Math.sqrt(detal))/(2 *a));
				System.out.println("Phương trình có 2 nghiệm phân biệt:");
				System.out.println("x1 = "+ x1);
				System.out.println("x2 = "+ x2);
			}
		}
	}
}
