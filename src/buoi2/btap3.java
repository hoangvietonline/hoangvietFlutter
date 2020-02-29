package buoi2;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class btap3 {
	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("== greatest common divisor == ");
		System.out.println("Enter integer a");
		a = sc.nextInt();
		System.out.println("Enter integer b");
		b= sc.nextInt();
		System.out.println("Greatest common divisor" + a + " and " + b + " : " 
		+greatestCommonDivisor(a, b));
		
	}

	private static int greatestCommonDivisor(int a, int b) {
		int temp1 = a;
		int temp2 = b;

		while (temp1 != temp2) {
			if (temp1 > temp2) {
				temp1 -= temp2;
			} else {
				temp2 -= temp1;
			}
		}
		return temp1;
	}

}
